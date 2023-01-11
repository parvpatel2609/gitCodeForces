import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solve_problem=0,count=0;
        int problem=sc.nextInt();
        int time_to_reach=sc.nextInt();
        int baki_time=240-time_to_reach;
//        System.out.println(baki_time);
        int i=1;
        do{
            solve_problem+=(i)*5;
            i++;
//            System.out.println("Value of the i : " + i);
            if(solve_problem<=baki_time){
                count++;
            }
            if(solve_problem>baki_time){
                break;
            }
        }while(i<=problem);
        System.out.println(count);
    }
}