package OOP.OOPBasics.DefiningClasses.ExerciseOne;

public class BankAccount {
    private int id;
    private double balance;

    BankAccount(int id) {
        this.setId(id);
        this.balance = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }
}