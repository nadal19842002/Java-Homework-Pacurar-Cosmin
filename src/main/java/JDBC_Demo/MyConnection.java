package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

package Connection;

public class MyConnection {

    static Connection con = null;

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load....");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Rododendron1");
            System.out.println("Driver was found.");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
