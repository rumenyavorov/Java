package Java.Basics.Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String team = sc.nextLine();
        String typeKit = sc.nextLine();
        int kitQuantity = Integer.parseInt(sc.nextLine());

        double total = 0;

        if(team.equals("Argentina")){
            if(typeKit.equals("flags")){
                total = kitQuantity * 3.25;
            } else if(typeKit.equals("caps")){
                total = kitQuantity * 7.20;
            } else if(typeKit.equals("posters")){
                total = kitQuantity * 5.10;
            } else if(typeKit.equals("stickers")){
                total = kitQuantity * 1.25;
            } else{
                System.out.println("Invalid stock!");
            }
        }else if(team.equals("Brazil")){
            if(typeKit.equals("flags")){
                total = kitQuantity * 4.20;
            } else if(typeKit.equals("caps")){
                total = kitQuantity * 8.50;
            } else if(typeKit.equals("posters")){
                total = kitQuantity * 5.35;
            } else if(typeKit.equals("stickers")){
                total = kitQuantity * 1.20;
            } else {
                System.out.println("Invalid stock!");
            }
        }else if(team.equals("Croatia")) {
            if (typeKit.equals("flags")) {
                total = kitQuantity * 2.75;
            } else if (typeKit.equals("caps")) {
                total = kitQuantity * 6.90;
            } else if (typeKit.equals("posters")) {
                total = kitQuantity * 4.95;
            } else if (typeKit.equals("stickers")){
                total = kitQuantity * 1.10;
            } else {
                System.out.println("Invalid stock!");
            }
        }else if(team.equals("Denmark")) {
            if (typeKit.equals("flags")) {
                total = kitQuantity * 3.10;
            } else if (typeKit.equals("caps")) {
                total = kitQuantity * 6.50;
            } else if (typeKit.equals("posters")) {
                total = kitQuantity * 4.80;
            } else if (typeKit.equals("stickers")){
                total = kitQuantity * 0.90;
            } else {
                System.out.println("Invalid stock!");
            }
        } else{
            System.out.println("Invalid country!");
        }

        if(total > 0)System.out.printf("Pepi bought %d %s of %s for %.2f lv.", kitQuantity, typeKit, team, total);

    }
}
