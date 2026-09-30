public class ClienteAPP implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Cliente recebeu notificação: Pedido está " + pedido.getStatus());
    }
}