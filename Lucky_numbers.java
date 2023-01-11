import java.math.BigInteger;
import java.util.Scanner;

public class Lucky_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            BigInteger n1 = new BigInteger(String.valueOf(sc.nextInt()));
            BigInteger n2 = new BigInteger(String.valueOf(sc.nextInt()));
            BigInteger result = n1.gcd(n2);
            System.out.println(result);
        }
    }
}
