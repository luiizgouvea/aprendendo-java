package Fila;

public class Fila <T> {

    private No<T> refEntFila;

    public Fila(){
        this.refEntFila = null;
    }



    public void enqueue(T obj){
        No novoNo = new No();
        novoNo.setRefNo(refEntFila);
        refEntFila = novoNo;
    }

    public T first (){
        if (!isEmpty()){
            No priNo = refEntFila;
            while (true){
                if (priNo.getRefNo() != null){
                    priNo = priNo.getRefNo();
                } else {
                    return (T) priNo.getObject();
                }
            }
        } 
        
        return null;
    }

    public T dequeueNo (){
        if (!isEmpty()){
            No priNo = refEntFila;
            No auxNo = refEntFila;
            while (true){
                if (priNo.getRefNo() != null){
                    auxNo = priNo;
                    priNo = priNo.getRefNo();
                } else {
                    auxNo.setRefNo(null);
                    break;
                }
            }
            return (T) priNo.getObject();
        } 
        
        return null;
    }

    public boolean isEmpty(){
        if (refEntFila == null){
            return true;
        } else {
            return false;
        }
    }



    @Override
    public String toString() {
        String stringRet ="";
        No noAux = refEntFila;
        if (refEntFila != null){
            while (true){
                stringRet += "No objeto= "+noAux.getObject()+" | ";
                if (noAux.getRefNo()!= null){
                    noAux = noAux.getRefNo();
                } else {
                    stringRet +=null;
                    break;
                }
            }
            } else {
                stringRet = null;
            }
            return stringRet;
    }
  
}
