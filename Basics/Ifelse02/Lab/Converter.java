package Java.Basics.Ifelse02.Lab;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());
        String first = sc.nextLine();
        String second = sc.nextLine();

        double result = 0;

        if(first.equals("mm")){
            result = number / 1000;
        } else if (first.equals("km")){
            result = number / 0.001;
        } else if(first.equals("cm")){
            result = number / 100;
        } else if(first.equals("mi")){
            result = number / 0.000621371192;
        } else if(first.equals("in")){
            result = number * 39.3700787;
        } else if(first.equals("ft")){
            result = number / 3.2808399;
        } else if(first.equals("yd")){
            result = number / 1.0936133;
        }

        if(second.equals("mm")){
            result = result * 1000;
        } else if (first.equals("km")){
            result = result * 0.001;
        } else if(first.equals("cm")){
            result = result * 100;
        } else if(first.equals("mi")){
            result = result * 0.000621371192;
        } else if(first.equals("in")){
            result = result * 39.3700787;
        } else if(first.equals("ft")){
            result = result * 3.2808399;
        } else if(first.equals("yd")){
            result = result * 1.0936133;
        }

        System.out.printf("%.8f", result);
    }
}
