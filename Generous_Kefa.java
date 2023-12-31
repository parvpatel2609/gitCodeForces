import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Generous_Kefa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int friends = sc.nextInt();
        String str = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }
            else{
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }
        }
        int count = 0;

        for(Map.Entry<Character, Integer> entry: hm.entrySet()){

        }

    }
}
