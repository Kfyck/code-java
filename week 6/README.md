# JOBSHEET 4 — Selection

**Name:** Ilyasa Aghlazabarjad Saleksa  
**NIM:** 264107020234  
**Prodi:** Computer Science  
**Class:** TI-1I  

## Topics
- `if`
- `if-else`
- `if-else if-else`
- `switch-case`
- `break`
- `default`
- Ternary operator `?:`

## Repository Structure
```text
JOBSHEET-4/
├── README.md
├── .gitignore
├── images/
│   └── selection-flow.svg
└── src/
    ├── experiment1/
    │   └── PemilihanIf15.java
    ├── experiment2/
    │   ├── PemilihanSwitch15.java
    │   └── SelectionIfElse15.java
    └── assignment/
        ├── Assignment1SelectionAttendanceNo.java
        ├── Assignment2SelectionAttendanceNo.java
        ├── AssignmentParkingAttendanceNo.java
        └── AssignmentQueueAttendanceNo.java
```

![Java Selection Flow](images/selection-flow.svg)

---

# Experiment 1 — IF / IF-ELSE

The program asks whether UKT has been paid and reads the answer as a `boolean`.

```java
import java.util.Scanner;

public class PemilihanIf15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registration rejected. Please pay your UKT first");
        }

        sc.close();
    }
}
```

### Explanation
- `true` executes the statements inside `if`.
- `false` skips the `if` block and executes `else`.
- `TRUE` is accepted as boolean input; `yes` causes an input error because `nextBoolean()` expects a boolean value.
- The `else` message handles unpaid UKT.

File: [`src/experiment1/PemilihanIf15.java`](src/experiment1/PemilihanIf15.java)

---

# Experiment 2 — SWITCH-CASE

```java
import java.util.Scanner;

public class PemilihanSwitch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS semester 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS semester 8 ditampilkan");
                break;
            default:
                System.out.println("Semester tidak valid");
        }

        sc.close();
    }
}
```

### Experiment results

If `break` is removed from case 5 and the input is `5`:

```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 5
KRS semester 5 ditampilkan
KRS semester 6 ditampilkan
```

`break` terminates the `switch` after the matching case.

Input `0` or `10` produces:

```text
Semester tidak valid
```

The `default` branch handles values that do not match cases 1–8.

A `double` cannot be used as the `switch` expression type. The types listed in the jobsheet answer are:

```text
byte
short
char
int
String
```

File: [`src/experiment2/PemilihanSwitch15.java`](src/experiment2/PemilihanSwitch15.java)

---

# SWITCH-CASE Converted to IF-ELSE IF-ELSE

```java
import java.util.Scanner;

public class SelectionIfElse15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }

        sc.close();
    }
}
```

The original jobsheet answer considers `switch-case` easier to read for this particular fixed-choice case.

---

# Assignment 1 — Ternary Operator

```java
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
```

General form:

```java
condition ? valueIfTrue : valueIfFalse;
```

The jobsheet answer states that ternary is better when there are two possible outcomes and should not be used when there are more than two possible outcomes.

File: [`src/assignment/Assignment1SelectionAttendanceNo.java`](src/assignment/Assignment1SelectionAttendanceNo.java)

---

# Assignment 2 — KRS Credit Validation

Maximum allowed credits: **24 SKS**.

```java
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
```

File: [`src/assignment/Assignment2SelectionAttendanceNo.java`](src/assignment/Assignment2SelectionAttendanceNo.java)

---

# Assignment 3A — Parking System

```java
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
```

File: [`src/assignment/AssignmentParkingAttendanceNo.java`](src/assignment/AssignmentParkingAttendanceNo.java)

---

# Assignment 3B — Academic Queue Machine

```java
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
```

File: [`src/assignment/AssignmentQueueAttendanceNo.java`](src/assignment/AssignmentQueueAttendanceNo.java)


