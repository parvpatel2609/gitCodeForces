import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();
        for(int i=0; i<num ; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n2-n1>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
