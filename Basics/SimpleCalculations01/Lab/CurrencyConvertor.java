package Java.Basics.SimpleCalculations01.Lab;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        String inputCurrency = sc.nextLine();
        String outputCurrency = sc.nextLine();

        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        double result = 0.0;

        if (inputCurrency.equals("BGN")){
            if (outputCurrency.equals("USD")){
                result = money / USD;
            } else if (outputCurrency.equals("EUR")){
                result = money / EUR;
            } else if (outputCurrency.equals("GBP")){
                result = money / GBP;
            }
        } else if(inputCurrency.equals("USD")){
            if (outputCurrency.equals("BGN")){
                result = money * USD;
            } else if(outputCurrency.equals("EUR")){
                result = money * USD / EUR;
            } else if(outputCurrency.equals("GBP")){
                result = money * USD / GBP;
            }
        } else if(inputCurrency.equals("EUR")){

            if (outputCurrency.equals("BGN")){
                result = money * EUR;
            } else if(outputCurrency.equals("USD")){
                result = money * EUR / USD;
            } else if(outputCurrency.equals("GBP")){
                result = money * EUR / GBP;
            }
        } else if(inputCurrency.equals("GBP")){
            money = GBP;
            if(outputCurrency.equals("USD")){
                result = money * GBP / USD;
            } else if(outputCurrency.equals("BGN")){
                result = money * GBP;
            } else if(outputCurrency.equals("EUR")){
                result = money * GBP / EUR;
            }
        }
        System.out.printf("%.2f", result);
    }
}
