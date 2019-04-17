package Java.Basics.WhileLoop04;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int space = width * length * height;
        boolean hasSpace = true;
        String command = sc.nextLine();
        while(!command.equals("Done")){
            int box = Integer.parseInt(command);
            space -= box;

            if(space < 0){
                hasSpace = false;
                break;
            }
            command = sc.nextLine();
        }
        if(hasSpace){
            System.out.printf("%d Cubic meters left.", space);
        } else{
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }
    }
}
