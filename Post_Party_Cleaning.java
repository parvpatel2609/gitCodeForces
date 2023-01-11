import java.util.Scanner;

public class Post_Party_Cleaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        int left_min = sc.nextInt();
        int length = sc.nextInt();
        int[] array = new int[length];

        for(int i=0; i<length; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<length; i++){
            sum += array[i];
            if(sum<=left_min){
                count++;
            }
        }
        System.out.println(count);
    }
}
