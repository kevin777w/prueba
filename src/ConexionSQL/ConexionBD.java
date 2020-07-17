package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    static String URL = "jdbc:mysql://localhost:3306/optica 3";
    static String LOGIN = "root";
    static String PASSWORD = "";
    static String BD = "optica 3";
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;

    public Connection getConection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, LOGIN, PASSWORD);

        } catch (Exception e) {
            System.out.println(e);

        }
        return con;

    }
}
