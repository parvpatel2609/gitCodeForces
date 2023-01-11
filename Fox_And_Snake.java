import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line=sc.nextInt();
        int size=sc.nextInt();
        for(int i=1; i<=line; i++){
            for(int j=1; j<=size; j++){
                if(i%2!=0){
                    System.out.print("#");
                }
                else {
                    if(i%4==0){
                        if(j==1){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                    }
                    else {
                        if(j==size){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
