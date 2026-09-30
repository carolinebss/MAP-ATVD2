import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private StatusPedido status;

    public Pedido() {
        this.status = StatusPedido.RECEBIDO;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
        notifyObservers();
    }
}