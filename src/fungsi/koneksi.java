package fungsi;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {
    public static Connection con;
    
    public static void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String database = "siasat";
            String host = "jdbc:mysql://localhost/"+database;
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(host,user,pass);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
