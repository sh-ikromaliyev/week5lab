public class BoardingPass {
    private String seatNumber;
    private String gate;

    public BoardingPass(String seatNumber, String gate) {
        this.seatNumber = seatNumber;
        this.gate = gate;
    }

    public String toString() {
        return "Seat: " + seatNumber + ", Gate: " + gate;
    }
}