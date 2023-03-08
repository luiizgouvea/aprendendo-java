import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um numero de 1 a 10 para ver a tabuada: ");
        num = scan.nextInt();

        System.out.println("Tabuada: ");
        for( int i = 1; i<=10 ; i++ ){
            System.out.println(num + "X"+ i+"="+i*num);
        }


    }
}
