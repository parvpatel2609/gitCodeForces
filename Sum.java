import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int max = Math.max(n1, Math.max(n2,n3));
            if(n1 == max){
                int re1 = n2 + n3;
                if(n1 == re1){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }

            if(n2 == max){
                int re1 = n1 + n3;
                if(n2 == re1){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }

            if(n3 == max){
                int re1 = n1 + n2;
                if(n3 == re1){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }
        }
    }
}
