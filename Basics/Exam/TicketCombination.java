package Java.Basics.Exam;

import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comb = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(char b = 'B'; b <= 'L'; b+=2){
            for(char f = 'f'; f >= 'a';f--){
                for(char a = 'A'; a <= 'C'; a++){
                    for(int i = 1; i <= 10; i++){
                        for(int j = 10; j >= 1; j--){
                            sum++;
                            if(sum == comb){
                                System.out.println("Ticket combination: " + b + f + a + i + j);
                                System.out.println("Prize: " + (b + f + a + i + j) + "lv.");
                            }
                        }
                    }
                }
            }
        }
    }
}
