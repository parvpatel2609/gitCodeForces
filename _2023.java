import java.util.ArrayList;
import java.util.Scanner;

public class _2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int multiplication = 1;
            int len = sc.nextInt();
            int[] arr = new int[len];
            int remove_no = sc.nextInt();
            for(int p=0; p< arr.length; p++){
                arr[p] = sc.nextInt();
                multiplication*=arr[p];
            }
            if(2023%multiplication==0){
                System.out.println("YES");
                int ans = 2023/multiplication;
                ArrayList<Integer> al = new ArrayList<>();
                al.add(ans);
                remove_no--;
                while(remove_no>0){
                    al.add(1);
                    remove_no--;
                }
                for(int q=0; q<al.size(); q++){
                    if(q!=al.size()-1)
                        System.out.print(al.get(q) + " ");
                    else
                        System.out.print(al.get(q));
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
