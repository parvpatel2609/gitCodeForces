import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        String str = sc.next();
        int upper=0,lower=0;
        int str_length = str.length();
        for(int i=0; i<str_length ; i++){
            char character = str.charAt(i);
            if(Character.isUpperCase(character)){
                upper++;
            }
            else{
                lower++;
            }
            if(upper > lower){
                result = str.toUpperCase();
            }
            else{
                result = str.toLowerCase();
            }
        }
        System.out.println(result);
    }
}

/*

Output:

HouSe
house

 */