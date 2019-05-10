package Advanced.StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class TakeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tokens = Arrays.asList(sc.nextLine().split("\\s+"));

        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (String token : tokens) {
            list.add(Integer.valueOf(token));
        }

        for (Integer nums : list) {
            if(10 <= nums && nums <= 20){
                list.add(nums);
                System.out.println(list);
            }
        }

//        System.out.println(list);


    }
}
