/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author BHAVESH
 */
public class conn1 {
    static Connection c;
    static Statement s;
    
    public static Connection getCon()throws Exception{ 
       if(c==null)
       { 
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///ams","root","");    
       }
       return c;
    }
      public static void AddFlight(String sql)throws Exception{
       getCon().createStatement().executeUpdate(sql);
}

      public static void AddEmployee(String sql)throws Exception{
       getCon().createStatement().executeUpdate(sql);
}    
} 

