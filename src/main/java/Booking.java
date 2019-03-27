public class Booking {
    private Room bedroom;
    private int numberOfNights;

    public Booking(Room room, int numberOfNights){
        this.bedroom = room;
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }


}
