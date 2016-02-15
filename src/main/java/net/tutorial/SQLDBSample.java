
import Classes.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import org.json.simple.parser.ParseException;

// @author PvR, IBM 2013
// @version 0.3
@WebServlet("/SQLDBSample")
public class SQLDBSample extends HttpServlet {

    public SQLDBSample() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setStatus(200);
        PrintWriter writer = response.getWriter();
        writer.println("IBM SQL Database, Java Demo Application using DB2 drivers");
        writer.println("Servlet: " + this.getClass().getName());
        writer.println();
        writer.println("Host IP:" + InetAddress.getLocalHost().getHostAddress());
        DBHelper db;
        try {
            db = new DBHelper(writer);
            Account bean = new Account();
            bean.setFname(request.getParameter("fname"));
            bean.setLname(request.getParameter("lname"));
            db.insertInto(bean);
            request.setAttribute("accountList", db.getAllAccount());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("viewAccounts.jsp");
            if (db.getAllAccount() != null) {
                rd.forward(request, response);

            }
        } catch (ParseException ex) {
            Logger.getLogger(SQLDBSample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
