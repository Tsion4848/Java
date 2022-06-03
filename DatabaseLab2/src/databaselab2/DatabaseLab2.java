package databaselab2;

import java.sql.*;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DatabaseLab2 {

    public static void main(String[] args) throws Exception {
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs, ss = null;
        
        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("insert ID: ");
//        int id = sc.nextInt();
//        System.out.println("insert First Name: ");
//        String fname = sc.next();
//        System.out.println("insert Last Name: ");
//        String lname = sc.next();
//        System.out.println("insert Email: ");
//        String email = sc.next();
//        System.out.println("insert Phone Number: ");
//        String phone = sc.next();
//        System.out.println("insert Salary: ");
//        double sal= sc.nextDouble();
//        System.out.println("insert Department: ");
//        String dep = sc.next();
//        System.out.println("insert Hired Date in date-month-year format: ");
//        String sdate = sc.next();
//                
//        
//        //convert string into date
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        Date d = sdf.parse(sdate);//util date
//        long ms = d.getTime();
//        java.sql.Date dbd = new java.sql.Date(ms);//sql date

        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "tsion", "zionzee");
            stmt = con.createStatement();
            
//           int x = stmt.executeUpdate("INSERT INTO Employee VALUES " + "(1, \'Tsion\', \'Moges\', \'tsionmoges1234@gmail.com\', \'0934568364\', \'2020-05-25\', 43000, \'Software\')");       
//           int x = stmt.executeUpdate("INSERT INTO Employee VALUES " + (id + ",\'fname\', \'lname\', \'email\', \'phone\', \'date\'," +  sal + ",\'dep\'"));
//           String str = "INSERT INTO Employee VALUES('" + id + "', '" + fname +"', '" + lname + "', '" + email + "', '"+ phone +"', '"+ date+ "', '"+ sal +"', '"+ dep +"')";
//           String str = "INSERT INTO `Employee` VALUES(`id`=?, `fname`=?, `lname`=?, `email`=?, `phone`=?, `date`=?)";
//           String str = "INSERT INTO Employee VALUES" + "(" + id + ",'fname', 'lname', 'email', 'phone',\'date\'," + sal + ",'dep')";
//           PreparedStatement ps = con.prepareStatement(str);
           
//           PreparedStatement ps = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?)");
//           ps.setInt(1, id);
//           ps.setString(2, fname);
//           ps.setString(3, lname);
//           ps.setString(4, email);
//           ps.setString(5, phone);
//           ps.setDate(6, dbd);
//           ps.setDouble(7, sal);
//           ps.setString(8, dep);
//           
//           int x = ps.executeUpdate();
//           
//           if (x == 0)
//               System.out.println("Record not sent");
//           else
//               System.out.println("Record sent successfully");
           

//update
            System.out.println("insert the id of the name you want to update");
            int uid = sc.nextInt();
            System.out.println("insert the new name");
            String nName = sc.next();
            int z = stmt.executeUpdate("UPDATE Employee SET FIRSTNAME = '" + nName + "'" + " WHERE EMPID=" + uid);
            
            //String ustr = "SELECT id FROM Employee WHERE FIRSTNAME LIKE ?";
            //String name = "UPDATE Employee SET FIRSTNAME = ? WHERE EMPID = ?";
            //int y = stmt.executeUpdate("UPDATE Employee SET EMAIL = \'bettyaman12345@gmail.com\' WHERE EMPID=" + 4);
            //PreparedStatement ups = con.prepareStatement(name);
            //PreparedStatement ups1 = con.prepareStatement(ustr);
//            ups.setInt(1, uid);
//            ups.setString(2, "\'nName\'");
            
            
            //ups.executeUpdate();
            //WHERE PHONENO = '" + sphone + "'"
            
            
//delete
            //int z = stmt.executeUpdate("DELETE FROM Employee WHERE EMPID=" + 4);
            
//            
////search                       
//            System.out.println("In which way do you want to search");
//            System.out.println("1. By ID");
//            System.out.println("2. By First Name");
//            System.out.println("3. By Last Name");
//            System.out.println("4. By Email");
//            System.out.println("5. By Phone Number");
//            System.out.println("6. By Salary");
//            System.out.println("7. By Department");
//            
//            int choice = sc.nextInt();
//            
//            switch(choice){
//                
//                case 1 : 
//                    System.out.println("Insert the Id");
//                    int sid = sc.nextInt();
//                    String query = "SELECT * FROM Employee WHERE EMPID = " + sid;
//                    rs = stmt.executeQuery(query);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                case 2:
//                    System.out.println("Insert the First Name");
//                    String sfname = sc.next();
//                    String query2 = "SELECT * FROM Employee WHERE FIRSTNAME = '" + sfname + "'";
//                    rs = stmt.executeQuery(query2);
//                    //System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            System.out.println(rs);
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                case 3:
//                    System.out.println("Insert the Last Name");
//                    String slname = sc.next();
//                    String query3 = "SELECT * FROM Employee WHERE LASTNAME = '" + slname + "'";
//                    rs = stmt.executeQuery(query3);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//////                    PreparedStatement sps = con.prepareStatement(query3);
//////                    sps.setString(1, query3);
//////                    rs = sps.executeQuery(query3);
//////                    while(rs.next()){
//////                    int f1 = rs.getInt(1);
//////                    String f2 = rs.getString(2);
//////                    String f3 = rs.getString(3);
//////                    String f4 = rs.getString(4);
//////                    String f5 = rs.getString(5);
//////                    Date f6 = rs.getDate(6);
//////                    double f7 = rs.getDouble(7);
//////                    String f8 = rs.getString(8);
//////                    
//////                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//////                        
//////                                System.out.print(f1 + "\t\t" + f2 + "\t\t" + f3 + "\t\t" + f4  + "\t\t" + f5 + "\t\t" + f6 + "\t\t" + f7 + "\t\t" + f8);
//////                                                break;
//////                    }
////                    
//                case 4:
//                    System.out.println("Insert the Email");
//                    String semail = sc.next();
//                    String query4 = "SELECT * FROM Employee WHERE EMAIL = '" + semail + "'";
//                    rs = stmt.executeQuery(query4);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                case 5:
//                    System.out.println("Insert the Phone Number");
//                    String sphone = sc.next();
//                    String query5 = "SELECT * FROM Employee WHERE PHONENO = '" + sphone + "'";
//                    rs = stmt.executeQuery(query5);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                case 6:
//                    System.out.println("Insert the Salary");
//                    double ssalary = sc.nextDouble();
//                    String query6 = "SELECT * FROM Employee WHERE SALARY = " + ssalary;
//                    rs = stmt.executeQuery(query6);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                case 7:
//                    System.out.println("Insert the Department");
//                    String sdep = sc.next();
//                    String query7 = "SELECT * FROM Employee WHERE DEPARTMENT = '" + sdep + "'";
//                    rs = stmt.executeQuery(query7);
//                    System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
//                        while (rs.next()){
//                            for (int i = 1 ; i <= 8 ; i++){
//                                System.out.print(rs.getObject(i) + "\t\t");
//                            }
//                            System.out.println();
//                        }
//                    break;
//                default: System.out.println("Not Found");
//        }
            
            
            
            
               
           
           rs = stmt.executeQuery("SELECT * FROM Employee");
           System.out.println("ID\t" + "\tFirst Name\t" + "Last Name\t" + "Email\t\t\t" + "\t\tPhone Number\t" + "\tHire Date\t" + "\tSalary\t" + "\tDepartment");
           while (rs.next()){
               for (int i = 1 ; i <= 8 ; i++){
                   System.out.print(rs.getObject(i) + "\t\t");
               }
               System.out.println();
           }
            //ps.close();
            con.close();
            
        }
        catch (SQLException exc){
            System.out.println(exc.getMessage());
        }                            
                               
    }
    
}
