import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
        }
        beautiful_matrix(array);
    }

    public static void beautiful_matrix(int[][] matrix){
        int count = 0;
        int row_num = 0, col_num = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    row_num = i;
                    col_num = j;
                    break;
                }
            }
        }

//        System.out.println(" Row : " + row_num + "    Col : " + col_num);

        if(row_num == 2 && col_num == 2){
            System.out.println(0);
        }

        if((row_num==2 && col_num==1) || (row_num==2 && col_num==3) || (row_num==1 && col_num==2) || (row_num==3 && col_num==2)){
            System.out.println(1);
        }

        if((row_num==2 && col_num==0) || (row_num==2 && col_num==4) || (row_num==1 && col_num==1) || (row_num==1 && col_num==3) ||
                (row_num==3 && col_num==1) || (row_num==3 && col_num==3) || (row_num==0 && col_num==2) || (row_num==4 && col_num==2) ){
            System.out.println(2);
        }

        if((row_num==0 && col_num==1) || (row_num==0 && col_num==3) || (row_num==1 && col_num==0) || (row_num==1 && col_num==4) ||
                (row_num==3 && col_num==0) || (row_num==3 && col_num==4) || (row_num==4 && col_num==1) || (row_num==4 && col_num==3)){
            System.out.println(3);
        }

        if((row_num==0 && col_num==0) || (row_num==0 && col_num==4) || (row_num==4 && col_num==0) || (row_num==4 && col_num==4)){
            System.out.println(4);
        }
    }
}
