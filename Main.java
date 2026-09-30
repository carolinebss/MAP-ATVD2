public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        ClienteAPP cliente = new ClienteAPP();
        RestaurantePainel restaurante = new RestaurantePainel();
        EntregadorAPP entregador = new EntregadorAPP();

        pedido.registerObserver(cliente);
        pedido.registerObserver(restaurante);
        pedido.registerObserver(entregador);

        pedido.setStatus(StatusPedido.PREPARANDO);
        pedido.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        pedido.setStatus(StatusPedido.ENTREGUE);
    }
}