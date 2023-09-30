import java.util.HashMap;
import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i=0; i<guest.length(); i++){
            if(!hm1.containsKey(guest.charAt(i))){
                hm1.put(guest.charAt(i), 1);
            }
            else {
                hm1.put(guest.charAt(i), hm1.get(guest.charAt(i))+1);
            }
        }

        for(int i=0; i<host.length(); i++){
            if(!hm1.containsKey(host.charAt(i))){
                hm1.put(host.charAt(i), 1);
            }
            else {
                hm1.put(host.charAt(i), hm1.get(host.charAt(i))+1);
            }
        }

        for(int i=0; i<pile.length(); i++){
            if(!hm2.containsKey(pile.charAt(i))){
                hm2.put(pile.charAt(i), 1);
            }
            else {
                hm2.put(pile.charAt(i), hm2.get(pile.charAt(i))+1);
            }
        }

//        System.out.println("hm1"+hm1);
//        System.out.println("hm2"+hm2);

        if(hm1.equals(hm2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
