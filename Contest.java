import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int misha = sc.nextInt();
        int vasya = sc.nextInt();
        int time_mi = sc.nextInt();
        int time_va = sc.nextInt();

        int a = (3*misha)/10;
        int b = misha - (misha/250)*time_mi;

        int c = (3*vasya)/10;
        int d = vasya - (vasya/250)*time_va;

        int m = Math.max(a,b);
        int v = Math.max(c,d);

        if(m > v){
            System.out.println("Misha");
        }
        else if (m == v) {
            System.out.println("Tie");
        }
        else{
            System.out.println("Vasya");
        }
    }
}
