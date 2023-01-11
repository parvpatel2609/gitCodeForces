import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int target = sc.nextInt();

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>target){
                sum += 2;
            }
            else{
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
