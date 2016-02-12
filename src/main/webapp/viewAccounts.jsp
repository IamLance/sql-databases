<%-- 
    Document   : viewAccounts
    Created on : Jan 28, 2016, 9:00:40 PM
    Author     : Lance
--%>

<%@page import="Classes.Account"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% ArrayList<Account> accountList = new ArrayList();
        accountList = (ArrayList<Account>) request.getAttribute("accountList");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Accounts</h1>
        <table><table style="width:100%">
                <% for (int i = 0; i < accountList.size(); i++) { %>
                <tr>
                    <td><%=accountList.get(i).getFname()%></td>
                    <td><%=accountList.get(i).getLname()%></td> 
                </tr>
                <%}%>
            </table>
    </body>
</html>
