import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String reverse_str1 = "";
        for(int i=str1.length()-1 ; i>=0 ; i--){
            char last = str1.charAt(i);
            reverse_str1 += last;
        }
        if(reverse_str1.equals(str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
