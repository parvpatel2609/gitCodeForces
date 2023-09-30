import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Logest_substring_without_repeating_characters {
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("pwwkew");
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == "" || s == null){
            return 0;
        }
        int ans = 0;
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), i);
                ans++;
                al.add(ans);
            }
            else{
                ans = 0;
                i=hm.get(s.charAt(i));
                hm.clear();
//                s = s.substring(hm.get(s.charAt(i))+1);
            }
            // System.out.println(s);
        }

        if(al.size() == 0){
            return s.length();
        }
        else{
            return Collections.max(al);
        }
    }
}