import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to divide in two friend if it possible then so yes otherwise no : ");
        int num=sc.nextInt();
        if(num%2==0 && num!=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

/*

Output:

Enter the number to divide in two friend if it possible then so yes otherwise no : 49
NO

 */