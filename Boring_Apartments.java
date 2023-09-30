import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            int length_digit = (int) Math.log10(val) + 1;
//            System.out.println("Length of digit: "+ length_digit);
            int reminder = val % 10;
//            System.out.println("Reminder: " + reminder);
            int ans =  (reminder-1) * 10;
//            System.out.println("Ans : " + ans);
            if(length_digit==1){
                ans += 1;
            }
            if(length_digit==2){
                ans += 3;
            }
            if(length_digit==3){
                ans += 6;
            }
            if(length_digit==4){
                ans += 10;
            }
            System.out.println(ans);
        }
    }
}
