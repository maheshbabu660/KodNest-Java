class Main {

    public static void main(String[] args) {
        int number = -345;
        int firstScore = 18;
        int secondScore = 25;

        // Check if number is Positive, Negative, or Zero
        if (number > 0) {
            System.out.println("Number type: Positive");
        } else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }

        // Check parity (Even or Odd)
        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        // Compare scores and display the larger score
        if (firstScore > secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else if (secondScore > firstScore) {
            System.out.println("Larger score: " + secondScore);
        } else {
            System.out.println("Both scores are equal: " + firstScore);
        }
    }
}
