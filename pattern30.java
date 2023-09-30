public class pattern30 {
    public static void pattern30_Kunal_for(int n){
        for(int row=1; row<=n; row++){

            //for spacing
            for(int space=0; space<n-row; space++){
                System.out.print("  ");
            }

            //for starting left triangle
            for(int col=row; col>=1; col--){
                System.out.print(col + " ");
            }

            //for ending right side triangle
            for(int col=2; col<=row; col++){
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern30_Kunal_for(5);
    }
}
