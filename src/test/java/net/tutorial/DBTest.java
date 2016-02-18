/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lance
 */
import Classes.Account;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.parser.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DBTest {

    private DBHelper h;

    
    @Before
    public void initializeDB() throws ParseException, FileNotFoundException {
       
        h = new DBHelper(new PrintWriter("logger.txt"));
    }


    public void insertShouldReturnInsert() {
        Account bean = new Account();
        bean.setFname("Lance");
        bean.setLname("Del Valle");
		System.out.println(h.insertInto(bean));
        assertEquals("inserting Lance should return Del Valle", "Del Valle", h.insertInto(bean));
    }
}
