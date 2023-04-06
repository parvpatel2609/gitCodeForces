import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = str.substring(1,str.length()-1);
//        System.out.println(ans);
        String[] arr = ans.split(", ");
//        System.out.println(Arrays.toString(arr));

        HashSet<String> hs = new HashSet<>();
        for(int i=0; i< arr.length; i++){

//            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
//            }
//            else{
//                continue;
//            }
        }

        if(str.equals("{}")){
            System.out.println(0);
        }
        else{
            System.out.println(hs.size());
        }
    }
}
