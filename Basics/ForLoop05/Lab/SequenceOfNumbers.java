package Java.Basics.ForLoop05.Lab;

import java.util.Scanner;

public class SequenceOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        String command = sc.nextLine();
         while(!command.equals("END")){
            int currentNumber = Integer.parseInt(command);
             if(currentNumber > maxNumber){
                 maxNumber = currentNumber;
             } else if(currentNumber < minNumber){
                 minNumber = currentNumber;
             }
             command = sc.nextLine();
        }
        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
