import java.util.Scanner;

class DeliveryCalculator {
    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

class prgm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int expressFee = sc.nextInt();

        DeliveryCalculator calculator = new DeliveryCalculator();

        int standardCharge = calculator.calculateCharge(distance);
        int expressCharge = calculator.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + standardCharge);
        System.out.println("Express Charge: " + expressCharge);
    }
}
