import java.util.Arrays;
import java.util.Scanner;

public class Tram {

    public static int arr_max(int[] array){
        int max = array[0];

        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[2*num];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[num];
        int j=0, val = 0;
        for(int i=1; i< arr.length-1; i++){

            if(i%2 != 0){
                val += arr[i];
                ans[j] = val;
                j++;
            }
            else {
                val -= arr[i];
            }
        }

        int max = arr_max(ans);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max);
    }
}
