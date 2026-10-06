# JOBSHEET 5

**Name:** Ilyasa Aghlazabarjad Saleksa  
**NIM:** 264107020234  
**Prodi:** Computer Science  
**Class:** TI-1I  

## Objective
1. Students can solve problems and case studies using nested selection statements.
2. Students can apply nested selection statements in Java programs.
3. Students can apply the logical operators &&, ||, and ! in selection structures.

## Experiment 1
```java
import java.util.Scanner;

public class NestedThesisExam15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.print("Has the student cleared all penalties? (yes/no): ");
        String noPenalty = sc.nextLine().trim();
        System.out.print("Enter the number of guidance sessions with supervisor1: ");
        int guidanceCount1 = sc.nextInt();
        System.out.print("Enter the number of guidance sessions with supervisor2: ");
        int guidanceCount2 = sc.nextInt();
        if (noPenalty.equalsIgnoreCase("yes")) {
            if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {
                message = "all requirements met. The student may register for the thesis exam";
            }else if (guidanceCount1 < 8 && guidanceCount2 < 4) {
                message = "Failed! Guidance session with Supervisor 1 are below 8 and supervisor 2 below 4";
            }else if (guidanceCount1 < 8) {
                message ="Failed! Guidance session with supervisor 1 have not reached 8";
            }else{
                message ="Failed! Guidance session with supervisor 2 have not reached 4";
            }
        }else{
            message = "Failed! student still has an outstanding penalty";
        }
        System.out.println(message);
    }
}
```
### Question
1. What happens if the student answers "No" to the penalty-clearance question? Why?
2. Explain the meaning of the following code snippet!
if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {
3. Describe the full flow of checking the student's requirements from start to finish. Explain
step by step for every condition!
### Answer
1. The program will print what on the else, because in the if condition stated that the requipment for if condition to run is to enter yes output.
2. the command say the condition for guidance1 have to be more than equal of 8 and the guidance2 have to be more than equal to 4, if it not met the requirment it will not print the output for that condition.
3. the first one is to check if the student have cleared all their penalties or not, if not the else condition will run. Then if the student have cleared all their penalties it will check if the student met the requirment of
guidance1 and guidance2, if not it will print out depending witch one is not met.
## Experiment 2
```java
import java.util.Scanner;
public class LogicalOperatorWifi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent;
        boolean isLecturer;
        boolean isBlocked;

        System.out.print("Is the user student? (true/false): ");
        isStudent = sc.nextBoolean();

        System.out.print("Is the user lecturer? (true/false): ");
        isLecturer = sc.nextBoolean();

        System.out.print("Is the account currently blocked? (true/false): ");
        isBlocked = sc.nextBoolean();
        if ((isStudent|| isLecturer) && !isBlocked) {
            System.out.println("Wifi access granted");
        }else{
            System.out.println("Wifi access denied");
        }
    }
} 
```
### Question
1. Explain the function of the ||, &&, and ! operators in the condition above.
2. Why can a lecturer still get access when isStudent = false?
3. Change || to &&. Run the program again using test data 1 and 2. What happens, and why?
4. In the expression isStudent || isLecturer, when does isLecturer not need to be
evaluated? Explain using short-circuit evaluation.
5. In the expression (isStudent || isLecturer) && !isBlocked, when does !isBlocked
not need to be evaluated? Explain
### Answer
1. || funcion as (or) when one condition is true all the condition consider true, && funcion as (and) all variabel must be true for the condition to consider as true, ! for stated not(to deny the input).
2. because it use or (||) funcion so when one of them is true all the condition will consider true as well.
3. the wifi access will be denied, this is because when using && all the variabel  must be true to be consider as true statement.
4. since the isStudent variabel will read first when it true the next condition can be ignore because it use || that make it true as well.
5. !isBloced not need to be evaluated when both earlier variabel is false , this using short-circuit evaluation that make the whole statement is false.
## Experiment 3
```java
import java.util.Scanner;
public class NestedLabAccess15 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.print("Is the user active student? (true/false): ");
        isActiveStudent = sc.nextBoolean();
        System.out.print("Is the user in sanction? (true/false): ");
        isSanctioned = sc.nextBoolean();
        System.out.print("Is the user has lecturer permit? (true/false): ");
        hasLecturerPermit = sc.nextBoolean();
        System.out.print("Is the user is lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();
        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("laboratory access granted ");
            } else{
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        }else{
            System.out.println("Access denied: student status does not meet the requirement");
        }
    }
}
```
### Question
1. Why is the check hasLecturerPermit || isLabAssistant placed inside the first IF?
2. Explain the function of the &&, ||, and ! operators in this program.
3. Can the access requirement be written as a single condition: isActiveStudent &&
    !isSanctioned && (hasLecturerPermit || isLabAssistant)? Explain whether the
    final access decision stays the same.
4. What is the advantage of using Nested IF in this case, compared to a single IF, if the system
needs to show different reasons for denial?
5. Create one input combination that causes access to be denied at the first level, and one that
causes it to be denied at the second level.
### Answer
1. because it will check after the if condition is met, so it have to be inside the if statement to be check.
2. || funcion as (or) when one condition is true all the condition consider true, && funcion as (and) all variabel must be true for the condition to consider as true, ! for stated not(to deny the input).
3. the output will be the same because it use && that make the condition have to be all true.
4. it make it easier to see when the condition change and need to be inside another if statement.
5. (active student:true, isSanctioned : true), (active student:true, isSanctioned : false, hasLecturerPermit : false, isLabAssistant : false).
## Assignment
### Assignment 1
```java
import java.util.Scanner;

public class dicountBookStore15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hari, buku;
        double discount = 0, harga;
        int jumlahBuku;

        System.out.print("hari pembelian: ");
        hari = sc.nextLine();
        System.out.print("Jenis buku yang dibeli (kamus/novel): ");
        buku = sc.nextLine();
        System.out.print("Jumlah buku yang dibeli: ");
        jumlahBuku = sc.nextInt();
        System.out.print("Harga buku: ");
        harga = sc.nextDouble();
        if (hari.equalsIgnoreCase("rabu")) {
            if (buku.equalsIgnoreCase("kamus")) {
                discount = 0.10 * harga;
                if (jumlahBuku > 2) {
                    discount += 0.02 * discount;
                }
            }else if (buku.equalsIgnoreCase("novel")) {
                discount = 0.07 * harga;
                if (jumlahBuku > 3) {
                    discount += harga * 0.02;
                }else if (jumlahBuku <= 3) {
                    discount += harga * 0.01;
                }
            }else{
                if (jumlahBuku > 3) {
                    discount = 0.05 * harga;
                }
            }  
        }else{
            System.out.println("Maaf hari ini tidak ada diskon");
        }
        System.out.println("Diskon yang didapat: " + discount);
        System.out.print("Total harga: " + (harga - discount));
    }
}
```
### Assignment 2
```java
import java.util.Scanner;

public class Task2AssistantSelection15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isActiveStudent, underSanction,  competencyCertificate;
        double grade, interviewGrade;

        System.out.print("Is the candidate active student? (true/fa;lse): ");
        isActiveStudent = sc.nextBoolean();
        System.out.print("is the candidate under sanction? (true/false): ");
        underSanction = sc.nextBoolean();
        System.out.print("is the candidate have programming competency certificate? (true/false): ");
        competencyCertificate = sc.nextBoolean();
        System.out.print("Enter grade of basic programming: ");
        grade = sc.nextDouble();
        System.out.print("Enter interview grade: ");
        interviewGrade = sc.nextDouble();

        if (isActiveStudent && !underSanction) {
            if (grade >= 80 || competencyCertificate) {
                if (interviewGrade >= 75) {
                    System.out.println("congratulation for being accepted");
                }else{
                    System.out.println("your not accepted, your interview score is below 75");
                }
            }else{
                System.out.println("your not accepted, your grade is below 80 ");
            }
        }else{
            
        }
    }
}
