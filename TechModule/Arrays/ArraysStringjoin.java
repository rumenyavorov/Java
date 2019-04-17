package Java.TechModule.Arrays;

public class ArraysStringjoin {
    public static void main(String[] args) {

        //string join
        String[] arr = {"one", "two"};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(String.join(" ", arr));

        // iterates through all elements in a collection
        int[] numbers = {1, 2, 3, 4, 5};
        for(int number : numbers){
            System.out.println(number  + " ");
        }
    }
}
