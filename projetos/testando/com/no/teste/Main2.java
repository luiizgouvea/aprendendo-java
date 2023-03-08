import javax.swing.SortOrder;

public class Main2 {
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("conteudo");

        No<String> no2 = new No<>("conteudo 2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("conteudo 3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("conteudo 4");

        no3.setProximoNo(no4);

        //no1.setConteudo("sdsadsa");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
    
}
