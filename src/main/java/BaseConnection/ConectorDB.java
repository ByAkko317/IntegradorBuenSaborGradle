package BaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorDB {

    private static final String URL = "jdbc:mysql://localhost:3306/BuenSaborDB";
    private static final String USER = "user";
    private static final String PASS = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, "");
    }

}
