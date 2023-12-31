import java.util.Arrays;
import java.util.Scanner;

public class Equal_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int j=0; j< arr.length; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            int min = arr[0];
            for(int j=1; j< arr.length; j++){
                if(arr[j]-min!=0){
                    count += arr[j]-min;
                }
            }
            System.out.println(count);
        }
    }
}
