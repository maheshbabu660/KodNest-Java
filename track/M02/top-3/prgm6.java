
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    double javaScore;
}

public class prgm6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student learner = new Student();

        learner.id = scan.nextInt();
        learner.name = scan.next();
        learner.course = scan.next();
        learner.javaScore = scan.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + learner.id);
        System.out.println("Name: " + learner.name);
        System.out.println("Course: " + learner.course);
        System.out.println("Java Score: " + learner.javaScore);

        scan.close();
    }
}
