import java.util.HashSet;
import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int len = sc.nextInt();
            String str = sc.next();
            HashSet<Character> hs = new HashSet<>();
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(!hs.contains(str.charAt(j))){
                    hs.add(str.charAt(j));
                    count += 2;
                }
                else{
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
