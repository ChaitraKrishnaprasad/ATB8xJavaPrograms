package RevisionPlan_15days.Day7_OOPS_Concepts;
//Encapsulation means wrapping data or variables and code or methods
// together in a single unit means class. It helps in data hiding and
// prevents direct access to the variables.

public class RLab021_OOPS1_Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000);
        account.deposit(500);
        System.out.println("Total account balance :" + account.getBalance());
    }
}

class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount>0){
            balance += amount;
        }
    }
}



