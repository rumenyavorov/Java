package Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        TreeSet<String> tableSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = sc.nextLine().split(" ");
            for (String element : elements) {
                tableSet.add(element);

            }//iter
        }//fori
        for (String s : tableSet) {
            System.out.print(s + " ");
        }
    }
}
