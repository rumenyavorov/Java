package Advanced.SetsAndMaps;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();

        while(true){
            String input = sc.nextLine();
            if(input.equals("END")){
                break;
            } else {
                String[] in = sc.nextLine().split(", ");
                if(in[0].equals("IN")) {
                    hashSet.add(in[1]);
                } else{
                    hashSet.remove(in[1]);
                }
            }
        }
        if(hashSet.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : hashSet) {
                System.out.println(s);
            }
//            System.out.println(hashSet);
        }
    }
}
