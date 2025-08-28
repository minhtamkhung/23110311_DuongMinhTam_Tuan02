package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LTWeb";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";

    private static Connection con;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DBConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public static Connection getConnection() throws SQLException {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        }
        return con;
    }

    public static void main(String[] args) {
        try {
            Connection c = getConnection();
            if (c == null) {
                System.out.println("something wrong");
            } else {
                System.out.println("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
