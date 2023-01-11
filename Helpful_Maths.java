import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr_str = str.split("\\+");

//        for(int i=0; i< arr_str.length; i++){
//            System.out.print(arr_str[i] + " ");
//        }

        int[] array = new int[arr_str.length];
        for(int i=0; i< arr_str.length; i++){
            array[i] = Integer.parseInt(arr_str[i]);
        }

        Arrays.sort(array);

        for(int i=0; i< array.length; i++){
            if(i != array.length-1){
                System.out.print(array[i] + "+");
            }
            else {
                System.out.println(array[i]);
            }
        }
    }
}
