import java.util.Scanner;

public class Compare_T_Shirt_Sizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            int count1 =0, count2 = 0;

            char last_str1 = str1.charAt(str1.length()-1);
            char last_str2 = str2.charAt(str2.length()-1);

            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j) =='X'){
                    count1++;
                }
            }

            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(j) =='X'){
                    count2++;
                }
            }

            if(count1>count2 && last_str1 == 'S' && last_str2 == 'S'){
                System.out.println("<");
            }

            else if(count1<count2 && last_str1 == 'S' && last_str2 == 'S'){
                System.out.println(">");
            }

            else if(count1>count2 && last_str1 == 'L' && last_str2 == 'L'){
                System.out.println(">");
            }

            else if(count1<count2 && last_str1 == 'L' && last_str2 == 'L'){
                System.out.println("<");
            }

            else if(last_str1 == 'S' && last_str2 == 'M'){
                System.out.println("<");
            }

            else if(last_str1 == 'L' && last_str2 == 'M'){
                System.out.println(">");
            }

            else if(str1.equalsIgnoreCase(str2)){
                System.out.println("=");
            }
        }
    }
}
