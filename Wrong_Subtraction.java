import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=0, n = 0;
        value = sc.nextInt();
        n = sc.nextInt();
        int r = 0;
        for(int i=1; i<=n; i++){
            r = value%10;
            if(r==0){
                value = value/10;
            }
            else{
                value--;
            }
        }
        System.out.println(value);
    }
}
