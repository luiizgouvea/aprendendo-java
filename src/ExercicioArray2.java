import java.util.Scanner;

public class ExercicioArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int numConsoantes = 0;
        int cont = 0;

        do {
            System.out.println("Digite um caractere: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                        consoantes[cont]= letra;
                        numConsoantes++;
                }
                cont++;
                
        } while(cont < consoantes.length);
        System.out.println("Consoantes");
        for (String consoante : consoantes) {
            if (consoante!=null){
                System.out.print(consoante+" ");
            }
        }
        scan.nextLine();
        System.out.println("A quantidade de consoantes é: "+numConsoantes);

    }
    
}
