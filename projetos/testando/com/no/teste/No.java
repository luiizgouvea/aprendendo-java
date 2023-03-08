public class No<T>  {

    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    
    

    /**
     * @return String return the conteudo
     */
    public T getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return No return the proximoNo
     */
    public No<T> getProximoNo() {
        return proximoNo;
    }

    /**
     * @param proximoNo the proximoNo to set
     */
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString(){
        return ("Conteudo do No: " + this.conteudo);
    }

}
