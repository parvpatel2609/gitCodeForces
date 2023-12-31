import java.util.Scanner;

public class Modular_Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int po = (int) Math.pow(2,n);
        System.out.println(m%po);
    }
}
