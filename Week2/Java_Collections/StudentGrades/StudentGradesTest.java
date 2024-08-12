public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        // Test adding students
        grades.addStudent(new Student(1, "Afsha", 'A'));
        grades.addStudent(new Student(2, "Bob ", 'B'));
        grades.addStudent(new Student(3, "Samba", 'C'));

        // Display students
        grades.displayStudents();

        // Test updating student grades
        System.out.println("Updating grade of Student ID 2 to 'A': " + grades.updateStudentGrade(2, 'A'));
        System.out.println("Updating grade of Student ID 4 (non-existent): " + grades.updateStudentGrade(4, 'B'));

        // Display students after update
        grades.displayStudents();

        // Test removing students
        System.out.println("Removing Student ID 3: " + grades.removeStudent(3));
        System.out.println("Removing Student ID 4 (non-existent): " + grades.removeStudent(4));

        // Display students after removal
        grades.displayStudents();
    }
}