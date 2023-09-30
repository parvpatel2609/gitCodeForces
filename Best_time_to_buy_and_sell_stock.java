import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Best_time_to_buy_and_sell_stock {

    public static int findMin(int arr[], int n)
    {
        int min_ele = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min_ele) {
                min_ele = arr[i];
            }
        }
        return min_ele;
    }

    public static int binarySearch(int[] arr, int t)
    {
        System.out.println(Arrays.toString(arr));
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

    public static int findMaximum(int[] arr, int low, int high)
    {
        int max = arr[low];
        int i;
        for (i = low; i <= high; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int maxProfit(int[] prices) {
        ArrayList<Integer> al1 = new ArrayList<>();

        for(int i=0; i<prices.length; i++){
            int max_val = findMaximum(prices, i, prices.length-1);
            al1.add(max_val-prices[i]);
        }

        return Collections.max(al1);

//        int min = findMin(prices, prices.length);
//        System.out.println(min);
//        int index_min = binarySearch(prices, min);
//        if(index_min == prices.length-1){
//            return 0;
//        }
//        else{
//            ArrayList<Integer> al = new ArrayList<>();
//            System.out.println("Min index " + index_min);
//            for(int i=index_min; i<prices.length; i++){
//                al.add(prices[i]);
//            }
//            int sell =  Collections.max(al);
//            return sell - min;
//        }

    }

    public static void main(String[] args) {
        int[] pieces = {7,1,5,3,6,4};
        int ans = maxProfit(pieces);
        System.out.println("Ans: " + ans);
    }
}
