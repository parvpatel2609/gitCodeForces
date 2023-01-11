import java.util.HashMap;
import java.util.Scanner;

public class Registration_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<num; i++){
            String str = sc.next();

            if(hm.containsKey(str)){
                String newstr = str + (hm.get(str) + 1);
                System.out.println(newstr);

                hm.put(str, hm.get(str)+1);
            }
            else{
                hm.put(str, 0);
                System.out.println("OK");
            }

        }

    }
}
