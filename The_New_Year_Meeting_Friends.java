import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0; i< arr.length-1; i++){
            int difference = Math.abs(arr[i]-arr[i+1]);
            sum += difference;
        }
        System.out.println(sum);
    }
}
