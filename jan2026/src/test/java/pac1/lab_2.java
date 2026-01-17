package pac1;
 
class Account {
    protected int accountNumber;
    protected double balance;
 
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
 
    public double getBalance() {
        return balance;
    }
}
 
 
class SavingsAccount extends Account {
 
    private final double MINIMUM_BALANCE = 1000.0;
 
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
 
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Savings Account withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of "
                    + MINIMUM_BALANCE + " must be maintained.");
        }
    }
}
 
 
class CurrentAccount extends Account {
 
    private double overdraftLimit;
 
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
 
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current Account withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded. Withdrawal denied.");
        }
    }
 
    public boolean withdrawWithStatus(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
 
 
public class lab_2 {
    public static void main(String[] args) {
 
        Account savings = new SavingsAccount(101, 5000);
        Account current = new CurrentAccount(102, 2000, 3000);
 
        System.out.println("Savings Account:");
        savings.withdraw(3500);
 
        System.out.println("\nCurrent Account:");
        current.withdraw(4500);
    }
}
 