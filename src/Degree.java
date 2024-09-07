import java.util.ArrayList;
import java.util.Scanner;

public class Degree extends BaseObject{
Double score;
Subject subject;
Student student;

void fillScore() {
    System.out.println("Enter score:");
    Scanner scanner = new Scanner(System.in);
    score = scanner.nextDouble();
}

    void print () {
        System.out.print("ID: ");
        System.out.println(id);
        System.out.print("Subject: ");
        System.out.println(subject.name);
        System.out.print("Score: ");
        System.out.println(score);

    }

}



