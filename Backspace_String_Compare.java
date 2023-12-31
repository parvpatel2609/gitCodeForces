import java.util.Stack;

public class Backspace_String_Compare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#' && !s1.isEmpty()){
                s1.pop();
            }
            else{
                if(s.charAt(i)!='#'){
                    s1.add(s.charAt(i));
                }
            }
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#' && !s2.isEmpty()){
                s2.pop();
            }
            else{
                if(t.charAt(i)!='#'){
                    s2.add(t.charAt(i));
                }
            }
        }
        String a1 = "", a2 = "";
        for(int i=s1.size(); i>=0; i--){
            if(!s1.isEmpty()){
                a1+=s1.pop();
            }
        }
        for(int i=s2.size(); i>=0; i--){
            if(!s2.isEmpty()){
                a2+=s2.pop();
            }
        }
        if(a1.equals(a2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="y#fo##f", t="y#f#o##f";
        System.out.println(backspaceCompare(s,t));
    }
}
