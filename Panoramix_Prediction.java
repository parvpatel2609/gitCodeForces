import java.util.Scanner;

public class Panoramix_Prediction {

    public  static int next_prime(int num){
        for(int i=num+1; i<=50; i++){
            if(prime_num(i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean prime_num(int num){
        int count = 0;
        for(int i=2; i<num; i++){
            if(num%i==0){
                count++;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        if(prime_num(min) && prime_num(max)){
            int next_prime_func = next_prime(min);
            if(next_prime_func == max){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}
