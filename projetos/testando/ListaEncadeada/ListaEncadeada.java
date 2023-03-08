package ListaEncadeada;

public class ListaEncadeada <T> {

    No <T> refEnt;

    public ListaEncadeada (){
        this.refEnt = null;
    }

    public void add(T cont){
        No <T> novoNo = new No<T>(cont);
        if (this.isEmpty()){
            refEnt = novoNo;
            return;
        }
        No<T> noAux = refEnt;

        for (int i =0 ; i<this.size()-1; i++){
            noAux = noAux.getProxNo();
        }

        noAux.setProxNo(novoNo);
    } 

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAux = refEnt;
        No<T> noRet = null;

        for (int i = 0; i<=index; i++){
            noRet = noAux;
            noAux = noAux.getProxNo();
        }
        return noRet;
    }
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            refEnt = noPivor.getProxNo();
            return noPivor.getConteudo();
        } else{
            No<T> noAnt = getNo(index-1);
            noAnt.setProxNo(noPivor.getProxNo());
            return noPivor.getConteudo();
        }
    }


    public boolean isEmpty(){
        if (refEnt == null){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        int tam = 0;
        No<T> refAux = refEnt;
        while (true){
            if(refAux != null){
                tam++;
                if (refAux.getProxNo()!=null){
                    refAux = refAux.getProxNo();
                } else {
                    break;
                }
            } else {
                break;
            } 
        }
        return tam;
    }

    public void validaIndice(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Indice "+index+ " vazio/inválido. A lista só vai até "+(size()-1));
        }
    }

    @Override
    public String toString() {
        String str = "";
        No<T> noAux = refEnt;
        for (int i = 0 ; i< this.size(); i++){
            str += " ListaEncadeada conteudo No [ " + noAux.getConteudo() + " ]";
            noAux = noAux.getProxNo();
        }
        str +=" Null";
        return str;
    }

    



    
}
