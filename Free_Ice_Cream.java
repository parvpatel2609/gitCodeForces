import java.util.Objects;
import java.util.Scanner;

public class Free_Ice_Cream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long ini_ice_cream = sc.nextLong();
        long count = 0;
        for(int i=0; i<num; i++){
            String symbol = sc.next();
            long val = sc.nextLong();
            if(Objects.equals(symbol, "+")){
                ini_ice_cream += val;
            }
            else{
                if(ini_ice_cream-val<0){
                    count++;
                }
                else{
                    ini_ice_cream -= val;
                }
            }
        }
        System.out.println(ini_ice_cream + " " + count);
    }
}
