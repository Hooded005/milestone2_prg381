package library.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
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
}
