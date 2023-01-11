import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini_value_bana = sc.nextInt();
        int have_money = sc.nextInt();
        int wants = sc.nextInt();
        int total_value = 0;
        for(int i=1 ; i<=wants ; i++){
            total_value += i*ini_value_bana;
        }
        int borrow_money = total_value - have_money;
        if(borrow_money>0){
            System.out.println(borrow_money);
        }
        else{
            System.out.println("0");
        }
    }
}
