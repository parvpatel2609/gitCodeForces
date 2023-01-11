import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_faces = 0;
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++){
            String shape = sc.next();
            if(shape.equals("Tetrahedron")){
                total_faces = total_faces + 4;
            }
            if(shape.equals("Cube")){
                total_faces = total_faces + 6;
            }
            if(shape.equals("Octahedron")){
                total_faces = total_faces + 8;
            }
            if(shape.equals("Dodecahedron")){
                total_faces = total_faces + 12;
            }
            if(shape.equals("Icosahedron")){
                total_faces = total_faces + 20;
            }
        }
        System.out.println(total_faces);
    }
}