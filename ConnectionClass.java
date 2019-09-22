/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class ConnectionClass {
    public static Connection connectionClass()throws SQLException,ClassNotFoundException{
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        final String url = "jdbc:mysql://localhost:3306/clg_db";
        final String uname = "root";
        final String passw = "";
        Connection conn = DriverManager.getConnection(url,uname,passw);
        if(conn == null){
            System.out.println("Connection Failed");
        }
        else{
            return conn;
        }
      }catch(Exception e){
          System.out.println(e);
      }  
      return null;
    }
    
}
