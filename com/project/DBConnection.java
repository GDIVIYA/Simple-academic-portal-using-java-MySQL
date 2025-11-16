
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // 1. Database Connection Parameters
    private static final String URL = "jdbc:mysql://localhost:3306/students_db";
    private static final String USER = "root";
    private static final String PASSWORD = "YourNewPassword123!"; 

    public static Connection getConnection() throws SQLException {
        try {
           
            
            // 2. Establish the connection using DriverManager
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Database Connection Failed! Check credentials and ensure MySQL Server is running.");
            e.printStackTrace();
            throw e; // Re-throw the exception so calling methods can handle it
        }
    }
}
