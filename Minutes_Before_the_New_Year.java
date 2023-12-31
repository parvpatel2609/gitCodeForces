import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int hour_pasted = sc.nextInt();
            int min_pasted = sc.nextInt();

            int pasted_min = hour_pasted*60 + min_pasted;
            System.out.println(1440-pasted_min);
        }
    }
}
