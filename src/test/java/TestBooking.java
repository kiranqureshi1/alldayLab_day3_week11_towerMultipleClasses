import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBooking {

    private Booking booking;
    private Room bedroom;

    @Before
    public void before(){
        booking = new Booking(bedroom, 50);
    }

    @Test
    public void getNumberOfNights(){
        assertEquals(50, booking.getNumberOfNights());
    }
}
