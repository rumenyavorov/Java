package Java.Basics.WhileLoop04.Lab;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book = sc.nextLine();
        int cap = Integer.parseInt(sc.nextLine());

        String currentBook = "";
        int count = 0;
        boolean found = false;
        while(!found && cap > count){
            currentBook = sc.nextLine();
            if(currentBook.equals(book)) found = true;
            else count++;
        }
        if(found) System.out.printf("You checked %d books and found it.", count);
        else System.out.printf("The book you search is not here!\nYou checked %d books.", count);
    }
}
