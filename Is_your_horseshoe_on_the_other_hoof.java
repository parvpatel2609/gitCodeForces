import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 4;
        int count =0;
        boolean flag = false;
        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                flag = false;
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
