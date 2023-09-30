import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ten_Words_of_Wisdom {

    static int largest(int[] arr)
    {
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static int findIndex(int arr[], int t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            ArrayList<Integer> al = new ArrayList<>();
            int input = sc.nextInt();
            int[] response = new int[input];
            int[] quantity = new int[input];
            for(int j=0; j<input; j++){
                response[j] = sc.nextInt();
                quantity[j] = sc.nextInt();
            }
            for(int j=0; j<input; j++){
                if(response[j]<=10){
                    al.add(quantity[j]);
                }
            }

            int max_qua = Collections.max(al);

            int index = findIndex(quantity, max_qua);
            System.out.println(index+1);

        }
    }
}
