import java.util.Scanner;

class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String book, member;
        int choice, days;
        double fine = 0;

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        System.out.print("Enter Book Name: ");
        book = sc.nextLine();

        System.out.print("Enter Member Name: ");
        member = sc.nextLine();

        System.out.println("\n1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("\nBook issued successfully!");
            System.out.println("Book      : " + book);
            System.out.println("Member    : " + member);
            System.out.println("Status    : Issued");

        }
        else if (choice == 2) {

            System.out.print("Enter number of days: ");
            days = sc.nextInt();

            if (days > 7) {
                fine = (days - 7) * 5;
            }

            System.out.println("\n===== BOOK RETURN =====");
            System.out.println("Book      : " + book);
            System.out.println("Member    : " + member);
            System.out.println("Fine      : Rs." + fine);

        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}