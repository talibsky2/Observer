public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();
        Client client1 = new Client();
        server.addClient(client);
        server.addClient(client1);
        server.setVersion(2.25);
        server.removeClient(client1);
        server.setVersion(2.26);

    }
}