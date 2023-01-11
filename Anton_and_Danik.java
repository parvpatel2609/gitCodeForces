import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) throws IOException {
        int a_count = 0, d_count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] array = sc.next().toCharArray();
        for(int i=0 ; i<num ; i++){
            //System.out.print(array[i]);
            if(array[i] == 'A'){
                a_count++;
                //System.out.println("hii " + a_count);
            }
            else{
                d_count++;
                //System.out.println("Hello " + d_count);
            }
        }
        if(a_count > d_count){
            System.out.println("Anton");
        } else if (d_count > a_count) {
            System.out.println("Danik");
        } else if (a_count==d_count) {
            System.out.println("Friendship");
        }
    }
}
