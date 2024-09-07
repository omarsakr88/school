import java.util.ArrayList;
import java.util.Scanner;

public class StudentClass extends BaseObject{
    String name;
    Teacher teacher;
    ArrayList<Student> students = new ArrayList<>();


    void fillName() {
        System.out.println("Enter student Class name:");
        Scanner scanner = new Scanner(System.in);
        name= scanner.next();
    }

    void print() {
        System.out.print("ID:");
        System.out.println(id);
        System.out.print("Name:");
        System.out.println(name);
        if (teacher != null) {
            System.out.print("Teacher:");
            System.out.println(teacher.name);
        }
        System.out.println("Students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.print("ID:");
            System.out.println(student.id);
            System.out.print("Name:");
            System.out.println(student.name);
        }
    }
}
