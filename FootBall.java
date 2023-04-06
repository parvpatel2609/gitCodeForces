import java.util.Scanner;
public class FootBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = false;
        int cou = 0;

        if(str.contains("0000000") || str.contains("1111111")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

//        for(int i=0; i<str.length()-1; i++){
//
//            if(str.length() < 7){
//                break;
//            }
//
//            for(int j=i+1; j<str.length(); j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    cou++;
//                }
//                else{
//                    cou=0;
//                }
//
//                if(cou >= 7 ){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }
    }
}
