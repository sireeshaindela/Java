import java.util.Scanner;

public class StudentRecordSystem {

    static Scanner sc = new Scanner(System.in);

    static String studentName;
    static int rollNo;
    static double attendance;
    static int marks;

    static void enterStudentDetails() {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        attendance = sc.nextDouble();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        System.out.println("Student details saved successfully!");
    }

    static void generateReportCard() {
        System.out.println("\n===== STUDENT REPORT CARD =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Marks: " + marks);

        if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {

        enterStudentDetails();
        generateReportCard();

        sc.close();
    }
}