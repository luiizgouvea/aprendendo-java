import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi=1;

        System.out.println("De qual numero você deseja o fatorial");
        int fatorial = scan.nextInt();
        System.out.println("Fatorial:");

        for (int i = fatorial ; i>=1 ; i-- ){
            multi = multi*i;
        }
        System.out.println(multi);
    }
}
