public class Client implements Observer{
    @Override
    public void handleEvent(double version) {
        System.out.println("A new version available: " + version);
    }
}
