package aula.no;
public class No {

    private String conteudo;
    private No proximoNo;

    public No(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    
    

    /**
     * @return String return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return No return the proximoNo
     */
    public No getProximoNo() {
        return proximoNo;
    }

    /**
     * @param proximoNo the proximoNo to set
     */
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString(){
        return ("Conteudo do No: " + this.conteudo);
    }

}
