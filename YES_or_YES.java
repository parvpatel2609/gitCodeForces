import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String str = sc.next();
            if(str.equalsIgnoreCase("Yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
