import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Bob", passenger.getName());
    }

    @Test
    public void passengerNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canAssignPassengerName(){
        passenger.setName("Bobby");
        assertEquals("Bobby", passenger.getName());
    }

    @Test
    public void canAssignNumberOfBags(){
        passenger.setNumberOfBags(1);
        assertEquals(1, passenger.getNumberOfBags());
    }
}
