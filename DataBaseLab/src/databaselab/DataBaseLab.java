package databaselab;

import java.sql.*;
import java.util.Scanner;

public class DataBaseLab {
    
    public static void main(String[] args) {
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM tsi.lab";
        
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/lab", "tsi", "zion");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            System.out.println("ID\t" + "Name\t\t" + "Department");
            while (rs.next()){
            for (int i = 1 ; i <= 3 ; i++){
                System.out.print(rs.getObject(i) + "\t");
            }
            System.out.println();
        }
     }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
        
    }
    
}
