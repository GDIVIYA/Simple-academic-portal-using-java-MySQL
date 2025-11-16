

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentDAO {

    // SQL Query: We use '?' placeholders for security (PreparedStatement)
    private static final String INSERT_STUDENT_SQL = 
        "INSERT INTO students (name, roll_number, course) VALUES (?, ?, ?)";

    /**
     * Inserts a new student record into the 'students' table.
     * @param student The Student object to insert (must have name, rollNumber, course set).
     */
    public void insertStudent(Student student) {
        // Use try-with-resources to automatically close Connection and PreparedStatement
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)) {

            // 1. Set the parameters for the query
            // The index starts at 1, corresponding to the '?' placeholders in the SQL string
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getRollNumber());
            preparedStatement.setString(3, student.getCourse());

            // 2. Execute the INSERT query
            int rowsAffected = preparedStatement.executeUpdate();
            
            // 3. Check the result
            if (rowsAffected > 0) {
                System.out.println("✅ Student inserted successfully!");
            } else {
                System.out.println("❌ Failed to insert student.");
            }

        } catch (SQLException e) {
            System.err.println("Database Error during insertion: " + e.getMessage());
            // You may handle specific SQL exceptions here (e.g., duplicate roll_number)
            e.printStackTrace();
        }
    }
}