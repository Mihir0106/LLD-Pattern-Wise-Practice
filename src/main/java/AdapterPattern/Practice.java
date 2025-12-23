package AdapterPattern;

public class Practice {
    static void main() {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        Client client = new Client(adapter);

        client.TransferData();
    }
}
