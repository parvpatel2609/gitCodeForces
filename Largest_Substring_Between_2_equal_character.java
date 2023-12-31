import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Largest_Substring_Between_2_equal_character {
    public static int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), 1);
            else
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
//            System.out.println(hm);
            if(entry.getValue()>1){
                int first = s.indexOf(entry.getKey());
                int second = s.lastIndexOf(entry.getKey());
                al.add(second-first-1);
            }
        }
        if(al.size()==0)
            return -1;
        else
            return Collections.max(al);
    }

    public static void main(String[] args) {
        int ans = maxLengthBetweenEqualCharacters("abcsd");
        System.out.println(ans);
    }
}
