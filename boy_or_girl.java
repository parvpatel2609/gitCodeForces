import java.util.ArrayList;
import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str = sc.next();
        ArrayList<Character> chAraylist = new ArrayList<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(chAraylist.contains(ch)){

            }
            else{
                chAraylist.add(ch);
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
