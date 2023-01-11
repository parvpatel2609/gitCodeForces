import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int j=0; j<length; j++){
                arr[j] = sc.nextInt();
            }
            boolean flag = false;
            for(int j=0; j< arr.length; j++){
                for(int k=j+1; k< arr.length; k++){
                    if(arr[j] == arr[k]){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
