import java.util.HashMap;
import java.util.Objects;

public class word_pattern {
    public static void main(String[] args) {
        boolean flag = wordPattern("abba", "dog dog dog dog");
        System.out.println(flag);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        HashMap<Character, String> hm = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                hm.put(pattern.charAt(i), arr[i]);
            }
            else{
                String hm_value = hm.get(pattern.charAt(i));
                if(!Objects.equals(hm_value, arr[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
