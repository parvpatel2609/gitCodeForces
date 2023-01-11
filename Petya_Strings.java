import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0,sum1=0;
        System.out.println("Enter the first string : ");
        String str1 = sc.next().toLowerCase();
        System.out.println("Enter the second string : ");
        String str2 = sc.next().toLowerCase();
        if(str1.compareTo(str2) == 0){              //compareTo method ae character ni ascii value no difference leshe
            System.out.println("0");
        }
        else if (str1.compareTo(str2) > 0) {
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
}

//aslkjlkasdd
//asdlkjdajwi

// upper ni be string ma l-d ni ascii value karishu to ae positive integer number aavashe atle str1>str2 atle 1 print thashe console screen ma

/*

Output:

Enter the first string :
aslkjlkasdd
Enter the second string :
asdlkjdajwi
1

 */