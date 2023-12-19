import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ahista Tasya Kamila
 */
public class Koneksii {
    private static Connection mysqlconfig;
public static Connection configDB() throws SQLException{
    
    try {
        String url = "jdbc:mysql://localhost/uas_aplikasi";
        String user = "root";
        String pass = "";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlconfig = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e){
        System.err.println("Koneksi gagal" + e.getMessage());
    }
    return mysqlconfig;    
}   
}
