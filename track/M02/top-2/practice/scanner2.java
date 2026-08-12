
import java.util.Scanner;

public class scanner2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Age is :" + age);

        System.out.println("Enter your height:");
        float height = scan.nextFloat();
        System.out.println("Height is:" + height);

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Full name: " + fullName);

    }
}
