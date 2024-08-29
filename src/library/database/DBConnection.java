package library.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.resources.books;

public class DBConnection 
{
    
    private static books book = new books();
    
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    
    private static final String JDBC_URL = "jdbc:derby:studentDB;create=true";
    
    Connection con;
    
    public DBConnection()
    {
        
    }
    public void connect() throws ClassNotFoundException
    {
        try
        {
            Class.forName(DRIVER);
            this.con = (Connection) DriverManager.getConnection(JDBC_URL);
            if (this.con != null)
            {
                System.out.println("Connection successful");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void createBooksTable()
    {
        try
        {
            String query = "Create Table Books "
                    + "(BookID varchar(20), "
                    + "Title varchar(20), "
                    + "Author varchar(20))"
                    + "Year int)";
            
            this.con.createStatement().execute(query);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void createBorrowerTable()
    {
        try
        {
            String query = "Create Table Borrowers "
                    + "(BorrowerID varchar(20), "
                    + "Name varchar(20), "
                    + "Surname varchar(20))"
                    + "Returned boolean)";
            
            this.con.createStatement().execute(query);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void addBook(String id, String t, String a, int y)
    {
        String query = book.add(id, t, a, y);
        try 
        {
            this.con.createStatement().execute(query);
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
    public void deleteBook(String id)
    {
        String query = book.delete(id);
        try 
        {
            this.con.createStatement().execute(query);
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
}
