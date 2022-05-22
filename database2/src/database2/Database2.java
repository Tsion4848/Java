package database2;

import java.sql.*;
public class Database2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase" , "tsion", "zionzee");
            Statement stmt = con.createStatement();
            
            stmt.execute("CREATE TABLE Greetings (Name CHAR(20))");
            stmt.execute("INSERT INTO Greetings VALUES ('Hello World')");
            ResultSet result = stmt.executeQuery("SELECT * FROM Greetings");
            result.next();
            
            System.out.println(result.getString(1));
            result.close();
            stmt.execute("DROP TABLE Greetings");
            stmt.close();
            con.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
            ex = ex.getNextException();
        }
    }
    
}
