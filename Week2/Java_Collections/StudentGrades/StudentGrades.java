import java.util.LinkedHashMap;
import java.util.Map;

public class StudentGrades {
    private LinkedHashMap<Integer, Student> students;

    public StudentGrades() {
        students = new LinkedHashMap<>();
    }

    // 4. Add Students
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // 5. Remove Students
    public boolean removeStudent(int studentId) {
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            return true;
        }
        return false;
    }

    // 6. Update Student Grades
    public boolean updateStudentGrade(int studentId, char newGrade) {
        Student student = students.get(studentId);
        if (student != null) {
            student.setGrade(newGrade);
            return true;
        }
        return false;
    }

    // 7. Display Students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("Student Grades (insertion order):");
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}