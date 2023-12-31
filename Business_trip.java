import java.util.Arrays;
import java.util.Scanner;

public class Business_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int[] arr = new int[12];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int len = arr.length-1;
        while(month>0 && len>=0){
            month -= arr[len];
            len--;
            count++;
        }
        if(month>0){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }
    }
}
