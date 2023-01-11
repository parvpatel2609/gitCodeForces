import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Scanner sc1 = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0 ; i<num ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<=1399){
                System.out.println("Division 4");
            }
            else if(1400<=arr[i] && arr[i]<=1599){
                System.out.println("Division 3");
            }
            else if(1600<=arr[i] && arr[i]<=1899){
                System.out.println("Division 2");
            }
            else if(arr[i]>=1900){
                System.out.println("Division 1");
            }
        }
    }
}
