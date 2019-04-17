package Java.Basics.Nested03;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String city = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        double price = 0;

        if(product.equals("coffee")){
            if(city.equals("Sofia")){
                price = quantity * 0.50;
            } else if(city.equals("Plovdiv")){
                price = quantity * 0.40;
            } else if(city.equals("Varna")){
                price = quantity * 0.45;
            }
        } else if(product.equals("water")){
            if(city.equals("Sofia")){
                price = quantity * 0.80;
            } else if(city.equals("Plovdiv")){
                price = quantity * 0.70;
            } else if(city.equals("Varna")){
                price = quantity * 0.70;
            }
        } else if(product.equals("beer")){
            if(city.equals("Sofia")){
                price = quantity * 1.20;
            } else if(city.equals("Plovdiv")){
                price = quantity * 1.15;
            } else if(city.equals("Varna")){
                price = quantity * 1.10;
            }
        } else if(product.equals("sweets")){
            if(city.equals("Sofia")){
                price = quantity * 1.45;
            } else if(city.equals("Plovdiv")){
                price = quantity * 1.30;
            } else if(city.equals("Varna")){
                price = quantity * 1.35;
            }
        } else if(product.equals("peanuts")){
            if(city.equals("Sofia")){
                price = quantity * 1.60;
            } else if(city.equals("Plovdiv")){
                price = quantity * 1.50;
            } else if(city.equals("Varna")){
                price = quantity * 1.55;
            }
        }
        System.out.printf("%.1f", price);
    }
}
