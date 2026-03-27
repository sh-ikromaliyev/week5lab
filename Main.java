public class Main {
    public static void main(String[] args) {
        Flight f = new Flight("FL123", "Paris", "12A", "G5");
        System.out.println(f);

        SmartDevice d = new SmartDevice("Samsung", true);
        Hub<SmartDevice> hub = new Hub<>();
        hub.storeDevice(d);
        System.out.println(hub.statusReport());

        Professor p = new Professor("Dr. Smith");
        Book b = new Book("AI Basics", "John Doe");
        LibrarySystem ls = new LibrarySystem();
        ls.checkout(p, b);
    }
}