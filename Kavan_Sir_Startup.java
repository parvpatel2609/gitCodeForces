import java.util.HashMap;
import java.util.Scanner;

public class Kavan_Sir_Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        HashMap<String, Integer> mp = new HashMap<>();
        for(int i=0; i<num; i++){
            String str = sc.next();
            if(mp.containsKey(str)) {
                String newStr = str + (mp.get(str) + 1);
                System.out.println(newStr);
                mp.put(str, mp.get(str) + 1);
            }
            else {
                mp.put(str, 0);
                System.out.println("OK");
            }
        }
//        boolean flag = false;
//        int count = 0, index = 0;
//        String str = null;
//        for(int i=0; i< array.length; i++){
//            for(int j=i+1; j< array.length; j++){
//                if(Objects.equals(array[i], array[j])){
//                    index = j;
//                    str = array[index];
//                    System.out.println(j + " index : " + index);
//                    count++;
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag && i == index){
//                System.out.println(array[index] + count);
//                flag = false;
//            }
//            else{
//                System.out.println("OK");
//            }
//        }
    }
}
