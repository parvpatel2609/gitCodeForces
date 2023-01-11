import java.util.Scanner;

public class Kakashi_and_Boruto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0; i<array.length; i++){

            if(array[i] == 0 || array[i] == 1){
                if(i != array.length-1){
                    continue;
                }
                else {
                    System.out.println("S");
                    break;
                }
            }

            else{
                System.out.println("F");
                break;
            }

        }
    }
}
