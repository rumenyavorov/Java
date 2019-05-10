package Advanced.FunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).filter(e -> e % 2 == 0).collect(Collectors.toList());
    }
}
