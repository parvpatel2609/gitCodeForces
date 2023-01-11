import java.sql.SQLOutput;
import java.util.Scanner;

public class way_too_long_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words : ");
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++){
            System.out.print("Enter the word : ");
            String str = sc.next();
            if(str.length()>10){
                int length = str.length();
                char first = str.charAt(0);
                char last = str.charAt(length-1);
                System.out.print(first);
                System.out.print(length - 2);
                System.out.print(last);
                System.out.println();
            }
            else{
                System.out.println(str);
            }
        }
    }
}

/*

Output:

Enter the number of words : 2
Enter the word : parv
parv
Enter the word : pneumonoultramicroscopicsilicovolcanoconiosis
p43s

 */