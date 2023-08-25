import java.util.*;

public class main {
    public static void main(String[] args) {
        bankAccount account = new bankAccount(100.0);
        ATM atm = new ATM(account);
        atm.run();

    }
}