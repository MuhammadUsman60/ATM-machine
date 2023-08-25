import java.util.Scanner;

public class bankAccount {
    private double balance;

    public bankAccount(){
        this.balance = balance;
    }
    public bankAccount(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void checkingBalance(){
        System.out.println("Your balance is \t"+getBalance());
    }

    public boolean depositing(double ammount){
        if(ammount > 0){
            balance += ammount;
            System.out.println("deposit sucessful");
            return true;
        }
        else {
            System.out.println("Invalid deposit amount");
            return false;
        }
    }
    public void withdrawal(double amount){
        if(balance<=0 && balance < amount ){
            System.out.println("Insufficient balance");

        }
        else {
            balance -= amount;
            System.out.println("withdrawal sucessful");

        }
    }



}