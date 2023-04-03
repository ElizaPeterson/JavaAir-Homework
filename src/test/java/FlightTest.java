import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Pilot pilot;
    Flight flight;
    Plane plane;


    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747,"E27", "Amsterdam", "Glasgow", "7:25");
    }

    @Test
    public void planeHasFlightNumber(){
        assertEquals("E27", flight.getFlightNumber());
    }

    @Test
    public void planeHasDestination(){
        assertEquals("Amsterdam", flight.getDestination());
    }

    @Test
    public void planeHasDepartureAirport(){
        assertEquals("Glasgow", flight.getDepartureAirport());
    }

    @Test
    public void planeHasDepartureTime(){
        assertEquals("7:25", flight.getDepartureTime());
    }

    @Test
    public void canBookPassenger(){
        //Arrange
        Passenger passenger = new Passenger("Bob", 1);
        assertEquals("Seat booked", flight.bookPassenger(passenger));
    }
}
