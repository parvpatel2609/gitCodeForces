import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String n1 = sc.next();
        String n2 = sc.next();
        for(int i=0; i<n1.length(); i++){
            if(n1.charAt(i)==n2.charAt(i)){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }
        }

    }
}