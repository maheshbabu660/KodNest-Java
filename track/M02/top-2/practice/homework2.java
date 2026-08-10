
public class homework2 {

    public static void main(String[] args) {

        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        boolean placementReady = (marks >= 60) && (attendance >= 75);

        String message = placementReady
                ? "Placement Ready"
                : "Continue Preparation";

        System.out.println(message);

        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}
