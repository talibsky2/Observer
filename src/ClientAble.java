public interface ClientAble {
    void addClient (Observer o);
    void removeClient(Observer o);
    void notifyClients ();
}
