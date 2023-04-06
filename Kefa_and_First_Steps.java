import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(0);
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                count=1;
            }
            else{
                count++;
            }
            arrlist.add(count);
        }
//        System.out.println(arrlist);
        if(arrlist.size()>1){
            System.out.println(Collections.max(arrlist));
        }
        else{
            System.out.println(1);
        }
    }
}
