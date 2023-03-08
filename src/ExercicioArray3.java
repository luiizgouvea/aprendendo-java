import java.util.Random;

public class ExercicioArray3 {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int [] numAleatorios = new int[20];

        for(int i = 0; i<numAleatorios.length; i++){
            int num = aleatorio.nextInt(100);

            numAleatorios[i]= num;
        }
        System.out.print("Numeros aleatórios: ");

        for (int nume : numAleatorios) {
            System.out.print(nume+" ");
        }
        System.out.println();

        System.out.print("Sucessores dos Numeros aleatórios: ");
        for (int nume : numAleatorios) {
            System.out.print(nume+1+" ");
        }
        System.out.println();


        System.out.print("Antecessor dos Numeros aleatórios: ");
        for (int nume : numAleatorios) {
            System.out.print(nume-1+" ");
        }
    }
    
}
