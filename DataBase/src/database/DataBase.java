package database;

import java.sql.*;

public class DataBase {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;  
        ResultSet rs = null;
        ResultSetMetaData md = null;
        String query = "Select * from tsion.UNTITLED";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase" , "tsion", "zionzee");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            md = rs.getMetaData();
            
             int n = md.getColumnCount();
            
            for (int i = 1 ; i <= 4 ; i++){
                System.out.print(md.getColumnName(i) + "\t");
            }
            System.out.println();
            while(rs.next()){
//                int id = rs.getInt("ID");
//                String name = rs.getString("Name");
//                Date da = rs.getDate("DOB");
//                String pn = rs.getString("PhoneNumber");
//                
//                System.err.println(id + "   " + name + "    " + da + "  " + pn);

//or 

            for (int i = 1 ; i <= 4 ; i++){
                System.out.print(rs.getObject(i) + "\t");
            }
           System.out.println();
        
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
