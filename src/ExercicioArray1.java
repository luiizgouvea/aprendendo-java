public class ExercicioArray1 {
    public static void main(String[] args) {
        
        int[] vetor = {33, -7, 16, 66, 32, 17};
        int cont = 0;

        while (cont<vetor.length) {
            System.out.print(vetor[cont]+" ");
            cont++;

        }
        System.out.println("");
        for (int i = vetor.length-1; i>=0; i--){
            System.out.print(vetor[i]+" ");

        }


    }
    
}
