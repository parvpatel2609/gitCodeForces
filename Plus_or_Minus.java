import java.util.Scanner;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            int val3 = sc.nextInt();

            if(val1 > val3)
                System.out.println("-");
            else
                System.out.println("+");
        }
    }
}
