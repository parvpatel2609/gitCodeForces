import java.util.Scanner;

public class Soft_Drinking {
    public static int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else {
            return  c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
//        int value1=0, value2=0, value3=0, value4=0, result=0;
//        if(n>1 && n<1000 && k>1 && k<1000 && l>1 && l<1000 && c>1 && c<1000 && d>1 && d<1000 && p>1 && p<1000 && nl>1 && nl<1000 && np>1 && np<1000){
//            value1=k*l;
//            value2=value1/n;
//            value3=c*d;
//            value4=p/np;
//            result = min(value2, value3, value4)/nl;
//        }
        int total_mili=k*l;
        int drink_toast=total_mili/nl;
        int lime_toast=c*d;
        int salt_toast=p/np;
        int result = min(drink_toast, lime_toast, salt_toast)/n;
        System.out.println(result);
    }
}
