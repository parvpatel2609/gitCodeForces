import java.util.*;

public class Maximal_Continuous_Rest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0, max=0;
        if (arr[0] == arr[arr.length-1] && arr[0]==1) {
            count++;
        }
        int i=0,p=1;
        while(p<arr.length){
            if(arr[i]==arr[p] && arr[i]==1){
                count++;
            }
            else{
                i=p;
                max=Math.max(max,count);
                count=0;
            }
            p++;
        }
        System.out.println(max);

//        for(int i=0; i< arr.length; i++){
//            if(arr[i]==1){
//                count++;
//            }
//            else if(arr[arr.length-1]==1 && i==arr.length-1){
//                count++;
//                hs.add(count);
//            }
//            else {
//                hs.add(count);
//                count=0;
//            }
//        }
//        hs.add(count);
//        List<Integer> list = new ArrayList<>(hs);
//        System.out.println(Collections.max(list));
    }
}
