package Advanced.SetsAndMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nm = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> hashSetN = new HashSet<>();
        HashSet<Integer> hashSetM = new HashSet<>();

        int n = nm[0];
        int m = nm[1];

        for(int i = 0; i < n; i++){
            int nNumb = Integer.parseInt(sc.nextLine());
            hashSetN.add(nNumb);
        }

        for(int i = 0; i < m; i++){
            int mNumb = Integer.parseInt(sc.nextLine());
            hashSetM.add(mNumb);
        }

        for (Integer nNum : hashSetN) {
            for (Integer mNum : hashSetM) {
                if(nNum.equals(mNum)){

                    System.out.print(nNum + " ");
                }
            }
        }
    }
}
