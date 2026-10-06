import java.util.Scanner;

public class AssignmentQueueAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loket;

        System.out.println("--- Academic Service ---");
        System.out.println(
            "1. Legalisir ijazah\n" +
            "2. Surat keterangan aktif kuliah\n" +
            "3. Pembayaran UKT\n" +
            "4. Pengajuan cuti akademik"
        );

        System.out.print("Pilih keperluan: ");
        loket = sc.nextInt();

        switch (loket) {
            case 1:
                System.out.println("Legalisir ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Surat keterangan aktif kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Pengajuan cuti akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Service code is not available");
        }

        sc.close();
    }
}
