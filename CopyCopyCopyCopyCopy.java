import java.util.HashSet;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int j=0; j< arr.length; j++){
                arr[j] = sc.nextInt();
            }
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0; j< arr.length; j++){
                hs.add(arr[j]);
            }
            System.out.println(hs.size());
        }
    }
}
