package OOP.OOPBasics.DefiningClasses.ExerciseTwo;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, BankAccount> account = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input;

        while(!"End".equals(input = sc.nextLine())){
            String[] cmdArgs = input.split(" ");
            String type = cmdArgs[0];

            switch (type){
                case "Create":
                    createAccount();
                    break;
                case "Deposit":
                    double amount = Integer.parseInt(cmdArgs[2]);
                    depositSum(Integer.parseInt(cmdArgs[1]), amount);
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(cmdArgs[1]));
                    break;
                case "GetInterest":
                    int year = Integer.parseInt(cmdArgs[2]);
                    getInterest(Integer.parseInt(cmdArgs[1]), year);
                    break;
            }
        }

    }

    public static void getInterest(Integer id, int years){
        if(account.containsKey(id)){
            System.out.printf("%.2f\n", account.get(id).getInterest(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    public static void setInterest(double interest){
        BankAccount.setInterestRate(interest);
    }

    public static void depositSum(int id, Double amount){
        if (account.containsKey(id)) {
            account.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d\n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    public static void createAccount() {
        BankAccount bankAcc = new BankAccount();
        account.put(bankAcc.getId(), bankAcc);
        System.out.printf("Account ID%d created\n", bankAcc.getId());
    }
}
