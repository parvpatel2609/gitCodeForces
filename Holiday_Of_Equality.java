import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(num);
        for(int i=0; i<num; i++){
            al.add(sc.nextInt());
        }
        int max = Collections.max(al);
        int ans = 0;
        for(int i=0; i<al.size(); i++){
            ans += max-al.get(i);
        }
        System.out.println(ans);
    }
}
