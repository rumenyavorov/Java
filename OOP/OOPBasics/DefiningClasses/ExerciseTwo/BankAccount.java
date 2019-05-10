package OOP.OOPBasics.DefiningClasses.ExerciseTwo;

public class BankAccount {

    private static double rate = 0.02;
    private static int bankAccountCount = 1;

    private int id;
    private double balance;

    public BankAccount(){
        this.id = bankAccountCount++;
    }

    public int getId(){
        return this.id;
    }

    public static void setInterestRate(double interest){
        BankAccount.rate = interest;
   }

   public void deposit(double amount){
        this.balance += amount;
   }

   public double getInterest(int years){
        return this.balance * rate * years;
   }

}
