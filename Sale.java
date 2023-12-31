import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int TVs = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0, sum=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<0 && count<TVs){
                sum += Math.abs(arr[i]);
                count++;
            }
        }
        System.out.println(sum);
    }
}
