import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){
            if(i%2==0){
                System.out.print("I love ");
                if(i==num){
                    System.out.print("it");
                }
                else{
                    System.out.print("that ");
                }
            }
            else{
                System.out.print("I hate ");
                if(i==num){
                    System.out.print("it");
                }
                else{
                    System.out.print("that ");
                }
            }
        }
    }
}
