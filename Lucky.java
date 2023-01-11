import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int r1=0,r2=0;
            String str = sc.next();
            String s1 = str.substring(0,3);
            String s2 = str.substring(3,6);

//            System.out.println("First substring : "+s1);
//            System.out.println("Second substring : "+s2);
            for(int j=0; j<s1.length(); j++){
                int value = Integer.parseInt(String.valueOf(s1.charAt(j)));
                r1 += value;
            }
//            System.out.println("Addition of the first substring : "+r1);
            for(int j=0; j<s1.length(); j++){
                int value = Integer.parseInt(String.valueOf(s2.charAt(j)));
                r2 += value;
            }
//            System.out.println("Addition of the Second substring : "+r2);
            if(r1==r2){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
