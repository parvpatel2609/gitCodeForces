import java.util.Scanner;

public class Forgotten_Episode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length_arr = sc.nextInt();
        int num = 1;
        int total = 0;
        int[] arr = new int[length_arr-1];
        for(int i=0; i<length_arr-1 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<length_arr; i++){
            total += num;
            num++;
        }
        for(int i=0; i<length_arr-1 ; i++){
            total -= arr[i];
        }
        System.out.println(total);
    }
}
