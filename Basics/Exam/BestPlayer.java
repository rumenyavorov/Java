package Java.Basics.Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String playerName = sc.nextLine();

        int maxGoals = 0;
        String bestPlayer = "";
        boolean hatTrick = false;

        while(!playerName.equals("END")){
            int goals = Integer.parseInt(sc.nextLine());
            if(goals > maxGoals){
                maxGoals = goals;
                bestPlayer = playerName;
            }
            if(maxGoals >= 3){
                hatTrick = true;
            }
            if(maxGoals >= 10){
                break;
            }
            playerName = sc.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if(hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
