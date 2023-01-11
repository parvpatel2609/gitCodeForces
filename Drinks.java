import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        int num = sc.nextInt();
        int[] arr_volume = new int[num];
        for(int i=0; i<num; i++){
            arr_volume[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
            sum += arr_volume[i];
        }
        double value = sum/num;
        System.out.println(value);
    }
}
