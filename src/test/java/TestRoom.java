import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRoom {

    private Room bedRoom;
    private Room conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Chika");
        guest2 = new Guest("Zara");
        bedRoom = new Room(12, 2, "double room", 50, null, true);
        conferenceRoom = new Room(0, 20, null, 100, "meeting room", false);

    }

    @Test
    public void addGuest(){
        bedRoom.addGuest(guest1);
        assertEquals(1, bedRoom.getGuestCount());
    }

    @Test
    public void removeGuest(){
        bedRoom.addGuest(guest1);
        bedRoom.addGuest(guest2);
        bedRoom.removeGuest(guest1);
        assertEquals(1, bedRoom.getGuestCount());
    }

    @Test
    public void booked(){
        assertEquals(true, bedRoom.booked());
    }

    @Test
    public void getNightRate(){
        assertEquals(50, bedRoom.getNightyRate());
    }

}
