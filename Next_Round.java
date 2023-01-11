import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,value,count=0;
        num = sc.nextInt();
        value = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0 ; i<num ; i++){
            arr[i] = sc.nextInt();
        }
        value = arr[value-1];
        for(int j=0 ; j<num ; j++){
            if(arr[j]>=value && arr[j]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
