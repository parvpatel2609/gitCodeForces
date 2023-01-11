import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        boolean flag = false;
        int arr[] = new int[array_size];
        for(int i=0 ; i<array_size ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("HARD");
        }
        else {
            System.out.println("EASY");
        }
    }
}
