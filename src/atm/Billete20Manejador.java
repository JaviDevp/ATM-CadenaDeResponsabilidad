package atm;

public class Billete20Manejador extends Manejador{

    @Override
    public String retirar(RetiroPedido pedido) {
        String imp = "";
        int cantidadRequerida = pedido.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 20;
        
        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 20 bs";
        }
        
        int cantidadPendiente = cantidadRequerida % 20;

        if (cantidadPendiente > 0) {
            pedido.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(pedido);
        }
        
        return imp;
    }
    
}
