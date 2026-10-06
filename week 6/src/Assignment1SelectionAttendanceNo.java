import java.util.Scanner;

public class Assignment1SelectionAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = sc.nextBoolean();

        String message = uktLunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "";

        System.out.println(message);

        sc.close();
    }
}
