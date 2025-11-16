

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentDAO {

    private static final String INSERT_STUDENT_SQL = 
        "INSERT INTO students (name, roll_number, course) VALUES (?, ?, ?)";

    
    public void insertStudent(Student student) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)) {

            //  Set the parameters for the query
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getRollNumber());
            preparedStatement.setString(3, student.getCourse());

            int rowsAffected = preparedStatement.executeUpdate();
            
            // Check for the result
            if (rowsAffected > 0) {
                System.out.println(" Student inserted successfully!");
            } else {
                System.out.println("Failed to insert student.");
            }

        } catch (SQLException e) {
            System.err.println("Database Error during insertion: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
