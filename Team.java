import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to continue for loop how many times : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=0 ; i<num ; i++){
            int Petya = sc.nextInt();
            int Vasya = sc.nextInt();
            int Tonya = sc.nextInt();
            if( (Petya==1 && Vasya==1) || (Petya==1 && Tonya==1) || (Vasya==1 && Tonya==1) ){
                count++;
            }
        }
        System.out.println("Suggestion to attempts this number of problem of " + num + " : "+ count);
    }
}

/*

Output:

Enter the number to continue for loop how many times : 4
0 0 0
0 1 1
1 1 1
0 0 0
Suggestion to attempts this number of problem of 4 : 2

 */