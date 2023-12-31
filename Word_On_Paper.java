import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_On_Paper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        for(int i=0; i<num; i++){
            int row = 8, column = 8;
            char[][] arr = new char[row][column];
            for(int j=0; j< row; j++){
                String s=reader.readLine();
                for(int k=0; k<column; k++){
                    arr[j][k] = s.charAt(k);
                }
            }
            StringBuilder str = new StringBuilder();
            for(int j=0; j< row; j++){
                for(int k=0; k<column; k++){
                    if (arr[j][k] != '.') {
                        str.append(arr[j][k]);
                    }
                }
            }
            System.out.println(str);
        }
    }
}
