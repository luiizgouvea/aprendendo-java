package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada <String> minhListaEncadeada = new ListaEncadeada<String>();

        minhListaEncadeada.add("Teste 1");
        minhListaEncadeada.add("Teste 2");
        minhListaEncadeada.add("Teste 3");
        minhListaEncadeada.add("Teste 4");

        System.out.println(minhListaEncadeada.get(0));
        System.out.println(minhListaEncadeada.get(1));
        System.out.println(minhListaEncadeada.get(2));
        System.out.println(minhListaEncadeada.get(3));
        System.out.println(minhListaEncadeada);

        minhListaEncadeada.remove(2);

        System.out.println(minhListaEncadeada);

        minhListaEncadeada.add("Testao");

        System.out.println(minhListaEncadeada);
        minhListaEncadeada.remove(0);
        System.out.println(minhListaEncadeada);
    }
    
}
