import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Secret_Sport {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int len = Integer.parseInt(br.readLine());
            String str = br.readLine();
            System.out.println(str.charAt(str.length()-1));
        }
    }
}
