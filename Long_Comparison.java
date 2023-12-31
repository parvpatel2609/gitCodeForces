import java.util.Scanner;

public class Long_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int f = sc.nextInt();
            int f_zero_app = sc.nextInt();
            int s = sc.nextInt();
            int s_zero_app = sc.nextInt();
            StringBuilder s1 = new StringBuilder(Integer.toString(f));
            StringBuilder s2 = new StringBuilder(Integer.toString(s));
            int first_size = s1.length() + (int) Math.log10(f_zero_app)+1;
            int second_size = s2.length() + (int) Math.log10(s_zero_app)+1;
            if(first_size>second_size)
                System.out.println(">");
            else if (first_size<second_size)
                System.out.println("<");
            else{

            }
        }
    }
}
