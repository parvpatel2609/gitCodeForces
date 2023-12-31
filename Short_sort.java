//check how many characters are at write place with index

import java.util.Scanner;

public class Short_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String str = sc.next();
            int count = 0;
                if(str.charAt(0)!='a')
                    count++;
                if(str.charAt(1)!='b')
                    count++;
                if(str.charAt(2)!='c')
                    count++;
//            System.out.println("Count: "+ count);
            if(count>2)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
