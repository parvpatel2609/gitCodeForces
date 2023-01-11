import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        int num = sc.nextInt();
        int[] num_array = new int[num];
        for(int i=0; i<num; i++){
            num_array[i] = sc.nextInt();
        }
        for(int i=0; i<num-1; i++){
            if(num_array[i] != num_array[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
