package Pilha;

public class Main {
    public static void main(String[] args) {
        
        Pilha p = new Pilha();

        p.push(new No(1));
        p.push(new No(2));
        p.push(new No(3));
        p.push(new No(4));
        p.push(new No(5));
        p.push(new No(6));

        System.out.println(p);

        p.pop();

        System.out.println(p);

        p.push(new No (99));
        System.out.println(p);
    }
    
}
