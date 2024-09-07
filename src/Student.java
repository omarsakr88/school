
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends BaseObject{
 String name;
 ArrayList<Degree> degreeList = new ArrayList<>();
    static ArrayList<Teacher> teacherList;


 void fillName() {
     System.out.println("Enter student name:");
     Scanner scanner = new Scanner(System.in);
     name = scanner.next();
 }

 void printScores() {
     System.out.println("Scores:");
     for (int i = 0; i < degreeList.size(); i++) {
         Degree degree = degreeList.get(i);
         degree.print();
     }
 }
     void print() {
         System.out.print("ID:");
         System.out.println(id);
         System.out.print("Name:");
         System.out.println(name);
     }

     Degree getDegree() {
         System.out.println("Enter degree ID:");
         Scanner scanner = new Scanner(System.in);
         Integer degreeId = scanner.nextInt();
         for (int i = 0; i < degreeList.size(); i++) {
             Degree degree = degreeList.get(i);
             if (degree.id.equals(degreeId)) {
                 return degree;
             }
         }
         return null;
     }
}