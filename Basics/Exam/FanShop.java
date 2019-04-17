package Java.Basics.Exam;

import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int price = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            String item = sc.nextLine();
            if(item.equals("flag")){
                price = 15;
            } else if(item.equals("hoodie")){
                price = 30;
            } else if(item.equals("keychain")){
                price = 4;
            } else if(item.equals("T-shirt")){
                price = 20;
            } else if(item.equals("sticker")){
                price = 1;
            }
            sum += price;
        }
        if(budget >= sum){
            System.out.printf("You bought %d items and left with %d lv.", n,budget-sum);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", sum - budget);
        }
    }
}
