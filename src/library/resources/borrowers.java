package library.resources;

import javax.swing.JOptionPane;

public class borrowers {    
    String borrowerID, name, surname, returned;

    public borrowers(String borrowerID, String name, String surname, String returned) {
        this.borrowerID = borrowerID;
        this.name = name;
        this.surname = surname;
        this.returned = returned;
    }

    public borrowers() {
    }

    public String getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(String borrowerID) {
        this.borrowerID = borrowerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public static String add(String borrowerID, String name, String surname, String returned) {
    String query = "";
    try {
        if (!"Yes".equalsIgnoreCase(returned) && !"No".equalsIgnoreCase(returned)) {
            JOptionPane.showMessageDialog(null, "The 'Returned' field must be filled in with 'Yes' or 'No'.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        query = "INSERT INTO Borrowers (BorrowerID, Name, Surname, Returned) VALUES "
                + "('" + borrowerID + "', '"
                + name + "', '"
                + surname + "', '"
                + returned + "')";
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return query;
}

    public static String delete(String borrowerID) {
        String query = "";
        try {
            query = "DELETE FROM Borrowers WHERE BorrowerID = '" + borrowerID + "'";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return query;
    }

    public  static String update(String borrowerID, String name, String surname, String returned) {
        if (!"Yes".equalsIgnoreCase(returned) && !"No".equalsIgnoreCase(returned)) {
            JOptionPane.showMessageDialog(null, "The 'Returned' field must be filled in with 'Yes' or 'No'.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String query = "";
        try {
            query = "UPDATE Borrowers SET "
                    + "Name = '" + name + "', "
                    + "Surname = '" + surname + "', "
                    + "Returned = '" + returned + "' "
                    + "WHERE BorrowerID = '" + borrowerID + "'";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return query;
    }

    public static String display() {
        String query = "SELECT * FROM Borrowers";
        return query;
    }
}

