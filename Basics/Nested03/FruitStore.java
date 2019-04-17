package Java.Basics.Nested03;

import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String day = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        double price = 0;

        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
        || day.equals("Friday")){
            if (product.equals("banana")){
                price = quantity * 2.50;
            } else if(product.equals("apple")){
                price = quantity * 1.20;
            } else if(product.equals("orange")){
                price = quantity * 0.85;
            } else if(product.equals("grapefruit")){
                price = quantity * 1.45;
            } else if(product.equals("kiwi")){
                price = quantity * 2.70;
            } else if(product.equals("pineapple")){
                price = quantity * 5.50;
            } else if(product.equals("grapes")){
                price = quantity * 3.85;
            }
        } else if(day.equals("Saturday") || day.equals("Sunday")){
            if (product.equals("banana")){
                price = quantity * 2.70;
            } else if(product.equals("apple")){
                price = quantity * 1.25;
            } else if(product.equals("orange")){
                price = quantity * 0.90;
            } else if(product.equals("grapefruit")){
                price = quantity * 1.60;
            } else if(product.equals("kiwi")){
                price = quantity * 3.00;
            } else if(product.equals("pineapple")){
                price = quantity * 5.60;
            } else if(product.equals("grapes")){
                price = quantity * 4.20;
            }
        }
        System.out.printf("%.2f",price);
    }
}
