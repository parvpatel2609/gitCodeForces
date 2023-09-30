import java.util.ArrayList;
import java.util.Scanner;

public class Cipher_Shifer {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i=0; i<num; i++){
//            int len = sc.nextInt();
//            String str = sc.next();
//            char[] arr = str.toCharArray();
//            StringBuilder ans = new StringBuilder();
//            for(int j=0; j< arr.length-1; j++){
//                ans.append(arr[j]);
//                if(arr[j]==arr[j+1]){
//                    j++;
//                    continue;
//                }
//                for(int p=j+1; p< arr.length; p++){
//                    if(arr[j] == arr[p] && arr[j]!=arr[j+1])
//                        j=p;
//                }
//            }
//            System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc -- > 0) {
            int num = sc.nextInt();
            String str = sc.next();
            ArrayList<Character> al = new ArrayList<>();
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < num; i++) {
                if (al.contains(str.charAt(i))) {
                    if (al.get(0) == str.charAt(i)) {
                        ans.append(str.charAt(i));
                        al.clear();
                    }
                } else {
                    al.add(str.charAt(i));
                }
            }

            System.out.println(ans);
        }
    }
}
