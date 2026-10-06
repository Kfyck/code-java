import java.util.Scanner;

public class AssignmentParkingAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir;
        int totalBiaya;

        System.out.print("Lama parkir: ");
        lamaParkir = sc.nextInt();

        if (lamaParkir < 2) {
            System.out.println("Total biaya = 2000");
        } else {
            totalBiaya = 2000 + (lamaParkir - 2) * 1000;
            System.out.println("Total biaya: " + totalBiaya);
        }

        sc.close();
    }
}
