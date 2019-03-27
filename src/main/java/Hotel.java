import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;
    private ArrayList<Room> emptyRooms;

    public Hotel(ArrayList<Room> rooms){
        this.rooms = rooms;
        this.bookings = new ArrayList<>();
        this.emptyRooms = new ArrayList<>();
    }

    public int getRoomGuestCount(Room room) {
        return room.getGuestCount();
    }

    public void checkIn(Room room, Guest guest){
//        for (Room room : rooms ) {
//            if (room == aaa){
        if(room.booked() == false)
           room.addGuest(guest);

//        }
    }

    public void checkOut(Room room, Guest guest){
        room.removeGuest(guest);
    }

    public Booking bookRoom(Room room, Booking booking){
        if(room.booked() == true){
            bookings.add(booking);
           return booking;
        }
        return null;
    }

    public int totalBill(Room room, Booking booking){
        return room.getNightyRate() * booking.getNumberOfNights();
    }

    public ArrayList getCollectionOfEmptyRooms(){
//        ArrayList<Room> emptyRoomsCollection = new ArrayList<>();
        for (Room room : rooms){
            if(room.booked() == false){
//                emptyRoomsCollection.add(room);
                this.emptyRooms.add(room);

            }
        }
        return this.emptyRooms;
    }

    public int getEmptyRooms(){
        return this.getCollectionOfEmptyRooms().size();
    }






}
