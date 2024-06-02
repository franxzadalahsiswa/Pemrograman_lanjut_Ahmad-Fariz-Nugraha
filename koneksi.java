package Config;
import java.util.logging.Level;
import java.sql.*;
import java.util.logging.Logger;

public class koneksi {
    private static Connection conn;
    public static Connection getConnection(){
        if (conn==null){
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e){
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,e);
            
        }
        }
        return conn;
    } 
    
    
}
