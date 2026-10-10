import java.util.Scanner;
class BankApplication{
 static int amount = 1000;
 void entry(){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE ACCOUNT NUMBER : ");
    String accountnumber = sc.nextLine();
    System.out.print("ENTER THE CUSTOMER NAME : ");
    String customername = sc.nextLine();
    System.out.println("");
    System.out.println("ACCOUNT NUMBER : "+accountnumber);
    System.out.println("CUSTOMER NAME : "+customername);
    System.out.println("INITIAL BALANCE : "+amount);
 }
 void deposit(){
    Scanner sc1 = new Scanner(System.in);
    System.out.println("");
    System.out.println("========== WELCOME TO DEPOSIT SECTION ==========");
    System.out.print("ENTER THE AMOUNT TO DEPOSIT : ");
    int depositmoney = sc1.nextInt();
    if(depositmoney > 0){
        amount = depositmoney + amount;
        System.out.println("=== SUCCESSFULLY DEPOSITED THE CASH ===");
        System.out.println("ACCOUNT BALANCE : "+amount);
    }
    else{
        System.out.println("*** ENTER THE AMOUNT GREATER THAN 0 ***");
    }

 }
 void withdraw(){
    Scanner sc2 = new Scanner(System.in);
    System.out.println("");
    System.out.println("========== WELCOME TO WITHDRAW SECTION ==========");
    System.out.print("ENTER THE AMOUNT TO WITHDRAW : ");
    int withdraw = sc2.nextInt();
    if(withdraw > 0){
        if(withdraw <= amount){
            amount = amount - withdraw;
            System.out.println("=== AMOUNT WITHDRAWED SUCCESSFULLY ===");
            System.out.println("ACCOUNT BALANCE : "+amount);
        }
        else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
 }
 int returnbalance(){
    System.out.println("");
    System.out.println("CURRENT ACCOUNT BALANCE : "+amount);
    return amount;
 }
void exit(){
    System.out.println("");
    System.out.println("========== THANK-YOU VISIT AGAIN ==========");
}
public static void main(String[] args){
    BankApplication atm = new BankApplication();
    atm.entry();
    atm.deposit();
    atm.withdraw();
    atm.returnbalance();
    atm.exit();
}
}