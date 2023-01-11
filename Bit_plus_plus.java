import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();;
        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = sc.next();
        }
        for(int i=0; i<num; i++){
            if(str[i].equals("++X") || str[i].equals("X++")){
                count++;
            }
            if(str[i].equals("--X") || str[i].equals("X--")){
                count--;
            }
        }
        System.out.println(count);
    }
}
