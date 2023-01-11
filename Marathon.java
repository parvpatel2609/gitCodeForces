import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=0; i<num; i++){
            int[] array = new int[4];
            for(int p=0; p< array.length; p++){
                array[p] = sc.nextInt();
            }
            for(int p=0; p< array.length; p++){
                if(array[0] < array[p]){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
