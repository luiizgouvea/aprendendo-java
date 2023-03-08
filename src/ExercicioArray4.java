import java.util.Random;

public class ExercicioArray4 {
    public static void main(String[] args) {
        Random ram = new Random();

        int [][] m = new int[4][4];

        for(int i = 0; i<m.length; i++){
            for(int j = 0; j< m[i].length; j++){
                m[i][j] = ram.nextInt(9);
            }
        }
        for (int[] linha : m) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");
                
            }
            System.out.println();
            
        }
    }
    
}
