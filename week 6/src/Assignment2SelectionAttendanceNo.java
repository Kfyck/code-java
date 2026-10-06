import java.util.Scanner;

public class Assignment2SelectionAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of credits: ");
        int totalCredit = sc.nextInt();

        if (totalCredit > 24) {
            System.out.println("Exceeds the limit");
        } else {
            System.out.println("KRS is valid");
        }

        sc.close();
    }
}
