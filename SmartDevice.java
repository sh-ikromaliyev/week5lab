public class SmartDevice {
    private String brand;
    private boolean isPowerOn;

    public SmartDevice(String brand, boolean isPowerOn) {
        this.brand = brand;
        this.isPowerOn = isPowerOn;
    }

    public String toString() {
        return brand + " is " + (isPowerOn ? "ON" : "OFF");
    }
}