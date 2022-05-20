package atm;

public class Billete50Manejador extends Manejador{

    @Override
    public String retirar(RetiroPedido pedido) {
        String imp = "";
        int cantidadRequerida = pedido.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 50;
        
        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 50 bs";
        }
        
        int cantidadPendiente = cantidadRequerida % 50;

        if (cantidadPendiente > 0) {
            pedido.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(pedido);
        }
        
        return imp;
    }
    
}
