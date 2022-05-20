package atm;


public abstract class Manejador {
    protected Manejador sucessor;
    
    public void setSucessor(Manejador sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract String retirar(RetiroPedido pedido);            
}
