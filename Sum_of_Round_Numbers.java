import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            int length = (int) (Math.log10(val) + 1);
            ArrayList<Integer> al = new ArrayList<>();

            for(int j=0; j<length; j++){
                int rem = val % 10;
                int insert = rem * (int) Math.pow(10,j);
                if(insert!=0)
                    al.add(insert);
                val /= 10;
            }
            System.out.println(al.size());
            for(int j=0; j<al.size(); j++){
                System.out.print(al.get(j) + " ");
            }
            System.out.println();
        }
    }
}
