package Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> treeSet = new LinkedHashSet<>();
        for(int i = 0; i < n; i++){
            String names = sc.nextLine();
            treeSet.add(names);
        }

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
