import java.util.Scanner;

public class stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num_char = sc.nextInt();
        char[] array = new char[0];
        array = sc.next().toCharArray();
        for(int i=0; i<num_char-1; i++){
            if(array[i] == array[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
