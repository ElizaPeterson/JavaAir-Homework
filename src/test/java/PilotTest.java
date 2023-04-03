import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bob", CabinCrewMemberRank.PILOT, "ABC123");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CabinCrewMemberRank.PILOT, pilot.getRank());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Plane go brrrr", pilot.fly());
    }

    @Test
    public void pilotHasLicence(){
        assertEquals("ABC123", pilot.getPilotLicence());
    }
}
