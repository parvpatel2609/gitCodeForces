import java.util.ArrayList;
import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        int count = 0;
        for(int i=1; i< arr.length; i++){
            if(arr[i]<min){
                count++;
                min = arr[i];
            }
            if(arr[i]>max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
