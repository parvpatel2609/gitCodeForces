import java.util.Scanner;

public class Hungry_Student_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            if(val==1 || val==2 || val==4 || val==5 || val==8 || val==11)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
