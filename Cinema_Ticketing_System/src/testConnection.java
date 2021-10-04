
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class testConnection {

    public static void main(String args[]) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","2001")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from db");
            }  
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        } 
    }
}
