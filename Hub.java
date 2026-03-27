public class Hub<T> {
    private T device;

    public void storeDevice(T item) {
        this.device = item;
    }

    public T getDevice() {
        return device;
    }

    public String statusReport() {
        return device.toString();
    }
}