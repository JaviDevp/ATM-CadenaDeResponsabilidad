package atm;

public class Billete10Manejador extends Manejador{

    @Override
    public String retirar(RetiroPedido pedido) {
        String imp = "";
        int cantidadRequerida = pedido.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 10;
        
        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 10 bs";
        }
        
        int cantidadPendiente = cantidadRequerida % 10;

        if (cantidadPendiente > 0) {
            pedido.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(pedido);
        }
        
        return imp;
    }
    
}
