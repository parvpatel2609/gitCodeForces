import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int year= value+1;
        boolean flag = false;
        while(flag==false) {
            String str_year = Integer.toString(year);
            for(int i=0; i<str_year.length(); i++){
                for(int j=i+1; j<str_year.length(); j++){
//                    System.out.println("i index " + i + " " + str_year.charAt(i) + "    j index " + j + " " +  str_year.charAt(j));
                    if(str_year.charAt(i)==str_year.charAt(j)){
                        flag=true;
//                        System.out.println(year + " for loop if block");
                        break;
                    }
                }
                if(flag==true){
                    break;
                }
            }
            if(flag==true){
                year++;
                flag=false;
            }
            else {
                System.out.println(year);
                break;
            }
        }
    }
}