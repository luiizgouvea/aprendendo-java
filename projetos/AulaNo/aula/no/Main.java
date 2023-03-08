package aula.no;

public class Main {
    public static void main(String[] args) {
        
        No no1 = new No("conteudo");

        No no2 = new No("conteudo 2");

        no1.setProximoNo(no2);

        No no3 = new No("conteudo 3");

        no2.setProximoNo(no3);

        No no4 = new No("conteudo 4");

        no3.setProximoNo(no4);

        no1.setConteudo("sdsadsa");

        
    }
    
}
