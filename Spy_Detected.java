import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num;i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int j=0; j< arr.length; j++){
                arr[j] = sc.nextInt();
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j=0; j< arr.length; j++){
                if(!hm.containsKey(arr[j])){
                    hm.put(arr[j], 1);
                }
                else{
                    hm.put(arr[j], hm.get(arr[j])+1);
                }
            }
//            System.out.println(hm);
            int val = 0;
            for(Map.Entry<Integer, Integer> e1: hm.entrySet()){
                if(e1.getValue() == 1){
                    val = e1.getKey();
                }
            }
            for(int p=0; p< arr.length; p++){
                if(val == arr[p]){
                    System.out.println(p+1);
                }
            }
        }
    }
}
