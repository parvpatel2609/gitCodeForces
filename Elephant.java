import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, answer = 0, val;
        while(answer < num){
            if(answer+5 <= num){
                count++;
                answer += 5;
//                System.out.println("Main if 5 : " + "  CO : " + count + " Num : " + num + " answer : " + answer);
                val = num - answer;
                if(val < 5 && val != 0){
                    count++;
//                    System.out.println("if 5 : " + "  CO : " + count + " Num : " + num + " value : " + val);
                    break;
                }
            }

            else if(answer+4 <= num){
                count++;
                answer += 4;
//                System.out.println("Main if 4 : " + "  CO : " + count + " Num : " + num + " answer : " + answer);
                val = num - answer;
                if(val < 4 && val != 0){
                    count++;
//                    System.out.println("if 4 : " + "  CO : " + count + " Num : " + num + " value : " + val);
                    break;
                }
            }

            else if(answer+3 <= num){
                count++;
                answer += 3;
//                System.out.println("Main if 3 : " + "  CO : " + count + " Num : " + num + " answer : " + answer);
                val = num - answer;
                if(val < 3 && val != 0){
                    count++;
//                    System.out.println("if 3 : " + "  CO : " + count + " Num : " + num + " value : " + val);
                    break;
                }
            }

            else if(answer+2 <= num){
                count++;
                answer += 2;
//                System.out.println("Main if 2 : " + "  CO : " + count + " Num : " + num + " answer : " + answer);
                val = num - answer;
                if(val < 2 && val != 0){
                    count++;
//                    System.out.println("if 2 : " + "  CO : " + count + " Num : " + num + " value : " + val);
                    break;
                }
            }

            else if(answer+1 <= num){
                count++;
                answer += 1;
//                System.out.println("Main if 1 : " + "  CO : " + count + " Num : " + num + " answer : " + answer);
                val = num - answer;
                if(val < 1 && val != 0){
                    count++;
//                    System.out.println("if 1 : " + "  CO : " + count + " Num : " + num + " value : " + val);
                    break;
                }
            }
//            System.out.println(" CO : " + count + " Num : " + num);
        }

        System.out.println(count);
    }
}
