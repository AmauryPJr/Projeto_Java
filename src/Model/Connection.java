/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
//import com.microsoft.sqlserver.jdbc;
import java.sql.*;
import com.sun.jdi.connect.spi;
/**
 *
 * @author Amaury
 */
public class DBConnection {
    public DBConnection() {
    }
    
    public Connection ToConnect() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                
            //Na minha máquina
            String dbURL = "jdbc:sqlserver://AMAURYPJR";
            String user = "sa";
            String pass = "MasterKey21@";
            conn = (Connection) DriverManager.getConnection(dbURL, user, pass);        
        }
        catch (Exception ex) {
            
        }
        
        return conn;
    }
}
