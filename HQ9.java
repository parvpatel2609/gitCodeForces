import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.contains("H") || str.contains("Q") || str.contains("9")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
