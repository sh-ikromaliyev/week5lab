public class Main {
    public static void main(String[] args) {
        Flight f = new Flight("a", "Paris", "12A", "1");
        System.out.println(f);

        SmartDevice d = new SmartDevice("Samsung", true);
        Hub<SmartDevice> hub = new Hub<>();
        hub.storeDevice(d);
        System.out.println(hub.statusReport());

        Professor p = new Professor("ABC");
        Book b = new Book("AI", "John");
        LibrarySystem ls = new LibrarySystem();
        ls.checkout(p, b);
    }
}
