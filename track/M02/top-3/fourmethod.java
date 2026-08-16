import java.util.Scanner;

class MethodDemo {

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        
        return 7;
    }

    int add(int first, int second) {
        return first + second;
        
    }
    void showMessage() {
        System.out.println("Hello from a method!");
    }
}

public class fourmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();

        MethodDemo object = new MethodDemo();
        object.showMessage();
        object.greet(name);

        int lucky = object.getLuckyNumber();
        int sum = object.add(first,second);
        System.out.println("Lucky Number: " + lucky);
        System.out.println("Sum: " + sum);

    }
}
