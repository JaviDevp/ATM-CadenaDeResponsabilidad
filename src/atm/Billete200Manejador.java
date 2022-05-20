package atm;

public class Billete200Manejador extends Manejador {

    @Override
    public String retirar(RetiroPedido pedido) {
        String imp = "";
        int cantidadRequerida = pedido.getCantidadRequerida();

        int cantBilletes = cantidadRequerida / 200;

        if (cantBilletes > 0) {
            imp = cantBilletes + " billetes de 200 bs";
            
        }

        int cantidadPendiente = cantidadRequerida % 200;

        if (cantidadPendiente > 0) {
            pedido.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(pedido);
        }

        return imp;
    }
}
