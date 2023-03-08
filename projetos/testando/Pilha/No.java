package Pilha;

public class No {

    private int dado;
    private No refNo = null;

    public No(){

    }

    public No(int dado){
        this.dado = dado;
    }

    
    

    /**
     * @return int return the dado
     */
    public int getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * @return No return the reNo
     */
    public No getRefNo() {
        return refNo;
    }

    /**
     * @param reNo the reNo to set
     */
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    

}
