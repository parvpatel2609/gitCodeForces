import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mishka_win = 0;
        int chris_win = 0;
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1>n2){
                mishka_win++;
            }
            if(n1<n2){
                chris_win++;
            }
        }
        if(mishka_win>chris_win){
            System.out.println("Mishka");
        }
        else if (chris_win>mishka_win) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
