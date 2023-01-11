import java.util.Scanner;

public class A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<num; i++){
            String str = sc.next();
            int n1 = Integer.parseInt(String.valueOf(str.charAt(0)));           ;
            int n2 = Integer.parseInt(String.valueOf(str.charAt(2)));
            System.out.println(n1 + n2);
        }
    }
}
