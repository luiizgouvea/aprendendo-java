import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int cont = 0;
        int numero = 0;
        int impar = 0;
        int par = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            cont++;
            if ((numero%2)==0) par++;
            else impar++;

        }while(cont<quantNumeros);
        System.out.println("Pares: "+par);
        System.out.println("Impares: "+impar);
    }
}
