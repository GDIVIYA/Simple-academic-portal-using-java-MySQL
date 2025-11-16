public class main {
    public static void main(String[] args) {
        
        studentDAO studentDAO = new studentDAO();
        
        // Create a new Student object
        Student newStudent = new Student(
            "Alice Smith", 
            "S1001", 
            "Computer Science"
        );
        
        System.out.println("Attempting to insert a new student...");
        
        // Call the INSERT method
        studentDAO.insertStudent(newStudent);

        Student anotherStudent = new Student(
            "Bob Johnson", 
            "S1002", 
            "Data Science"
        );
        studentDAO.insertStudent(anotherStudent);
    }
    
}
