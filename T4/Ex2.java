package T4;

abstract class Account {

    public double accountNo, balance;
    public String name;

    Account(double accountNo, String name, double balance) {

        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;

    }

    public void Deposit(double deposit) {

        balance += deposit;

    }

    abstract double calculateInterest();

    public void display() {
        System.out.println("\nName : " + name + "\nAccount Number : " + accountNo + "\nBalance : " + balance);
    }

}

class FixedDepositAccount extends Account {

    FixedDepositAccount(double accountNo, String name, double balance) {
        super(accountNo, name, balance);

    }

    protected double interestRate;
    protected double interest;

    double calculateInterest() {

        interest = balance * interestRate / 100;

        return interest;

    }

}

class SavingAccount extends FixedDepositAccount {

    SavingAccount(double accountNo, String name, double balance) {
        super(accountNo, name, balance);

    }

    public void withdraw(double amount) {

        balance -= amount;

    }

    double calculateInterest() {

        interest = balance * interestRate / 100 / 12;

        return interest;

    }

}

class Ex2 {
    public static void main(String args[]) {

        FixedDepositAccount fd = new FixedDepositAccount(1234, "Chalani", 2000);
        SavingAccount sa = new SavingAccount(2468, "Saumya", 5000);

        fd.Deposit(1000);
        sa.withdraw(1000);

        fd.display();
        sa.display();

    }
}
