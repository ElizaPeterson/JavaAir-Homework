import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;
    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Bob", CabinCrewMemberRank.CAPTAIN);
        cabinCrewMember2 = new CabinCrewMember("Bobby", CabinCrewMemberRank.FIRSTOFFICER);
        cabinCrewMember3 = new CabinCrewMember("Bobbo", CabinCrewMemberRank.FLIGHTATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Bo", CabinCrewMemberRank.PURSER);
    }

    @Test
    public void crewMemberHasName(){
        assertEquals("Bob", cabinCrewMember1.getName());
    }

    @Test
    public  void crewMemberHasRank(){
        assertEquals(CabinCrewMemberRank.CAPTAIN, cabinCrewMember1.getRank());
    }

    @Test
    public void crewMemberCanRelayMessage(){
        assertEquals("The fasten seatbelt sign is on", cabinCrewMember2.relayMessage());
    }

}
