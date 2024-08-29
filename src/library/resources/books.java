package library.resources;

public class books 
{    
    String id, title, author;
    String year;
    
    public books(String id, String title, String author, String year) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public books() 
    {
        
     }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String add(String id, String t, String a, String y)
    {        
        String query = "";
         try
        {
            query = "INSERT INTO Books VALUES "
                    + "('" + id + "', '"
                    + t + "', '"
                    + a + "', '"
                    + y + "')";
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
         
         return query;
    }
    
    public String delete (String id)
    {
        String query = "";
        
        try
        {
            query = "DELETE FROM Books"
                    + "\nWHERE BookID = '" + id + "'";
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        return query;
    }
    
    public String update(String id, String t, String a, String y)
    {        
        String query = "";
         try
        {
            query = "UPDATE Books"
                    + "\nSET Title = '" + t  + "', "
                    + "Author = '" + a + "', "
                    + "Year_Published = '" + y + "'"
                    + "\nWHERE BookID = '" + id + "'";
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
         
         return query;
    }
    
    public String display()
    {
        String query = "SELECT * FROM Books"
                + "\nORDER BY BookID";
        return query;
    }
}
