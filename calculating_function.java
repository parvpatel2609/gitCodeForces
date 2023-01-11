import java.util.Scanner;

public class calculating_function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if(num % 2 == 1) {
            System.out.println(num/2 - num);
        }
        else {
            System.out.println(num/2);
        }
        // -1 + 2 + -3 + 4 + -5
    }
}
