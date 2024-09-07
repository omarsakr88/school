import java.util.Scanner;

public class Teacher extends BaseObject{
    String name;


    void fillName() {
        System.out.println("Enter teacher name:");
        Scanner scanner = new Scanner(System.in);
        name= scanner.next();
    }

    void print() {
        System.out.print("ID:");
        System.out.println(id);
        System.out.print("Name:");
        System.out.println(name);
    }


}
