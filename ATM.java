import java.util.*;
public class ATM{
    private bankAccount bankAccount;

    public ATM(){
        this.bankAccount = bankAccount;
    }
    public ATM(bankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    public void displayMenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int chocice = sc.nextInt();

            switch (chocice) {
                case 1:
                    System.out.println("Current balance: " + bankAccount.getBalance());
                    break;
                case 2:

                    System.out.println("Enter deposit amount");
                    double depositing = sc.nextDouble();
                    bankAccount.depositing(depositing);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount");
                    double withdrawalAmount = sc.nextDouble();
                    bankAccount.withdrawal(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }

        }

    }


}
