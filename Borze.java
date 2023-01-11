import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='-'){
                if(str.charAt(i+1) =='.'){
                    System.out.print("1");
                    i++;
                    continue;
                }
                if(str.charAt(i+1) == '-'){
                    System.out.print("2");
                    i++;
                    continue;
                }
            }

            if(str.charAt(i)=='.'){
                System.out.print("0");
            }
        }
    }
}
