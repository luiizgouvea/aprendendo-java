import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");;
            numero = scan.nextInt();
            soma+=numero;
            cont++;
            if(numero>maior){
                maior = numero;
            }

        } while (cont<5);
        System.out.println("O maior numero é: "+maior);
        System.out.println("A media é: "+soma/cont);
    }
}
