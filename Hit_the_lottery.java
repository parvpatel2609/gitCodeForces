import java.util.Scanner;

public class Hit_the_lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count=0;
        while(num>0){
            if(num%100==0 && num>=100){
                num-=100;
//                System.out.println("hello");
                count++;
            }
            else if (num%20==0 && num>=20) {
                num-=20;
//                System.out.println("hiii");
                count++;
            } else if (num%10==0 && num>=10) {
                num-=10;
//                System.out.println("parv");
                count++;
            } else if (num%5==0 && num>=5) {
                num-=5;
//                System.out.println("ronak");
                count++;
            } else {
//                System.out.println("patel");
                num-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
