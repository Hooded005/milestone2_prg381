package library.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import library.resources.books;
import java.sql.ResultSet;
import java.util.Collections;

public class DBConnection 
{    
    private static final books book = new books();
    
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    
    private static final String JDBC_URL = "jdbc:derby:LibraryDB;create=true";
    
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
                System.out.println(con);
                System.out.println("Connection successful");
            }
        }
        catch(Exception ex)
        {
            System.out.println("We entered here");
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
                    + "Author varchar(20), "
                    + "Year_Published varchar(4))";
            
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
                    + "Surname varchar(20), "
                    + "Returned boolean)";
            
            this.con.createStatement().execute(query);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void addBook(String id, String t, String a, String y)
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
    
    public void updateBook(String id, String t, String a, String y)
    {
        String query = book.update(id, t, a, y);
        try 
        {
            this.con.createStatement().execute(query);
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String[]> displayBooks()
    {
        ArrayList<String[]> dataList = new ArrayList<>();
        String query = book.display();
        
        try 
        {
            ResultSet table = this.con.createStatement().executeQuery(query);
            
            while (table.next())
            {
                String id = table.getString("BookId");
                String t = table.getString("Title");
                String a = table.getString("Author");           
                String y = table.getString("Year_Published");
                
                String[] row = {id, t, a, y};
                dataList.add(row);
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        return dataList;
    }
}
