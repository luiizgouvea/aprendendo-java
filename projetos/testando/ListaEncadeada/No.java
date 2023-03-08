package ListaEncadeada;

public class No<T> {
    
    private T conteudo;
    private No proxNo;

    public No() {
        this.proxNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proxNo = null;
    }

    public No(T conteudo, No proxNo) {
        this.conteudo = conteudo;
        this.proxNo = proxNo;
    }

    /**
     * @return T return the conteudo
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
     * @return No return the proxNo
     */
    public No getProxNo() {
        return proxNo;
    }

    /**
     * @param proxNo the proxNo to set
     */
    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado(){
        String str = "No [conteudo=" + conteudo + "]";

        if (proxNo != null){
            str += "->" + proxNo.toString();
        } else {
            str += "->null";
        }

        return str;

    }

    

}
