package Fila;

public class Main {

    public static void main(String[] args) {
        
        Fila<String> f = new Fila<String>();

        f.enqueue("Primeiro");
        f.enqueue("Segundo");
        f.enqueue("Terceiro");
        f.enqueue("Quarto");

        //System.out.println(f);

        System.out.println(f.dequeueNo());

        //System.out.println(f);

        f.enqueue("luiz gustavo");

        //System.out.println(f);

        System.out.println(f.first());

        System.out.println(f);
        f.dequeueNo();
        System.out.println(f);

    }
    
}
