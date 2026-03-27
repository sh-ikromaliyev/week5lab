public class Flight {
    private String flightID;
    private String destination;
    private BoardingPass boardingPass;

    public Flight(String flightID, String destination, String seatNumber, String gate) {
        this.flightID = flightID;
        this.destination = destination;
        this.boardingPass = new BoardingPass(seatNumber, gate);
    }

    public String toString() {
        return flightID + " to " + destination + " | " + boardingPass;
    }
}