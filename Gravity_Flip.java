import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0; i< arr.length; i++){
            if(i!= arr.length-1){
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.print(arr[i]);
            }
        }
    }
}
