import java.util.Scanner;

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num);
        }
        else{
            int cp = Math.abs(num);
            String s1 = Integer.toString(cp);
            String update_1 = "", update_2 = "";
            for(int i=0; i<s1.length(); i++){
                if(i!=s1.length()-2){
                    update_1+=s1.charAt(i);
                }
            }
            for(int i=0; i<s1.length(); i++){
                if(i!=s1.length()-1){
                    update_2+=s1.charAt(i);
                }
            }
            int an1 = Integer.parseInt(update_1);
            int an2 = Integer.parseInt(update_2);
//            System.out.println("An1: " + an1);
//            System.out.println("An2: " + an2);
            int min = (-Math.min(an1, an2));
            System.out.println(min);
        }
    }
}
