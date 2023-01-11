import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int count =0;
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > 0){
                count += arr[i];
            }

            else if(arr[i] < 0){
                if(count>0){
                    count += arr[i];
                }
                else {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
