import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        String a = "codeforces";
        for(int i=0; i<num; i++){
            String str = sc.next();
            for(int k=0; k<str.length(); k++){
                if(str.charAt(k)!=a.charAt(k)){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
