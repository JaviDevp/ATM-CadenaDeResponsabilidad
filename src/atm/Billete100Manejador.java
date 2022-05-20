package atm;

public class Billete100Manejador extends Manejador{

    @Override
    public String retirar(RetiroPedido pedido) {
        String imp = "";
        int cantidadRequerida = pedido.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 100;
        
        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 100 bs";
        }
        
        int cantidadPendiente = cantidadRequerida % 100;

        if (cantidadPendiente > 0) {
            pedido.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(pedido);
        }
        
        return imp;
    }
    
}
