import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestHotel {

    private Hotel hotel;
    private Room bedRoom;
    private Room conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Booking booking;

    @Before
    public void before(){
        bedRoom = new Room(12, 2, "double room", 50, null, true);
        conferenceRoom = new Room(0, 20, null, 100, "meeting room", false);
        guest1 = new Guest("John");
        guest2 = new Guest("Kira");
        guest3 = new Guest("Gabor");
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(bedRoom);
        rooms.add(conferenceRoom);
        hotel = new Hotel(rooms);
        booking = new Booking(bedRoom, 5);
    }

    @Test
    public void checkIn(){
        hotel.checkIn(conferenceRoom, guest1);
        assertEquals(1, hotel.getRoomGuestCount(conferenceRoom));
//        assertEquals(1, bedRoom.getGuestCount());
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(conferenceRoom, guest1);
        hotel.checkIn(conferenceRoom, guest2);
        hotel.checkIn(conferenceRoom, guest3);
        bedRoom.removeGuest(guest1);
        hotel.checkOut(conferenceRoom, guest1);
        assertEquals(2, hotel.getRoomGuestCount(conferenceRoom));
    }

    @Test
    public void bookRoom(){
        assertEquals(booking, hotel.bookRoom(bedRoom, booking));
    }

    @Test
    public void totalBill(){
        assertEquals( 250, hotel.totalBill(bedRoom, booking));

    }

    @Test
    public void getCollectionOfEmptyRooms(){
        hotel.checkIn(bedRoom, guest1);
        assertEquals(1, hotel.getEmptyRooms());
    }






}
