import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        String pangram = sc.next().toLowerCase();
        //char[] array = sc.next().toCharArray();
        for(int i=0 ; i<num ; i++){

            if(pangram.contains("a") && pangram.contains("b") && pangram.contains("c") && pangram.contains("d") && pangram.contains("e") && pangram.contains("f") &&
                    pangram.contains("g") && pangram.contains("h") && pangram.contains("i") && pangram.contains("j") && pangram.contains("k") &&
                    pangram.contains("l") && pangram.contains("m") && pangram.contains("n") && pangram.contains("o") && pangram.contains("p") &&
                    pangram.contains("q") && pangram.contains("r") && pangram.contains("s") && pangram.contains("t") && pangram.contains("u") &&
                    pangram.contains("v") && pangram.contains("w") && pangram.contains("x") && pangram.contains("y") && pangram.contains("z")){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
