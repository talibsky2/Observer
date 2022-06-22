import java.util.ArrayList;
import java.util.List;

public class Server implements ClientAble{
    double version;
    List<Observer> clients = new ArrayList<>();

    public void setVersion(double version) {
        this.version = version;
        notifyClients();
    }

    @Override
    public void addClient(Observer o) {
        clients.add(o);
    }

    @Override
    public void removeClient(Observer o) {
        clients.remove(o);
    }

    @Override
    public void notifyClients() {
        for (Observer o: clients){
            o.handleEvent(version);
        }
    }
}
