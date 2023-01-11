import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = sc.nextInt();
        int count=0;
        int[] n1 = new int[num];
        int[] n2 = new int[num];
        for(int i=0; i<num ;i++){
            n1[i]=sc.nextInt();
            n2[i]=sc.nextInt();
            int r=n1[i]%n2[i];
            count = n2[i]-r;
//            while(r!=0){                      //time complexity exceed error
//                n1[i]++;
//                count++;
//                r=n1[i]%n2[i];
//            }
//            System.out.println(count);
//            count=0;
            if(r==0){
                System.out.println("0");
            }
            else{
                System.out.println(count);
            }
        }
    }
}