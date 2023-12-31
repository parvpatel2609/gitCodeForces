import java.util.HashMap;
import java.util.Scanner;
public class Case_of_the_Zeros_and_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), 1);
            }
            else{
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }
        }
        if(hm.containsKey('0') && hm.containsKey('1')){
            int zero = hm.get('0');
            int one = hm.get('1');
            int dif = Math.max(zero, one) - Math.min(zero,one);
            System.out.println(dif);
        }
        else if(!hm.containsKey('0')){
            System.out.println(str.length());
        }
        else{
            System.out.println(str.length());
        }
    }
}
