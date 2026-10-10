import java.util.Scanner;

public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String patientName;
    static int patientId;
    static String appointment;
    static double bill;

    static void registerPatient() {
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Patient ID: ");
        patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Appointment Details: ");
        appointment = sc.nextLine();

        System.out.println("Patient registered successfully!");
    }

    static void showPatientRecord() {
        System.out.println("\n===== PATIENT RECORD =====");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Appointment: " + appointment);
    }

    static void generateBill() {
        System.out.print("\nEnter consultation/medical bill amount: ");
        bill = sc.nextDouble();

        System.out.println("Bill Amount: Rs." + bill);
        System.out.println("Billing completed successfully!");
    }

    public static void main(String[] args) {

        registerPatient();
        showPatientRecord();
        generateBill();

        sc.close();
    }
}