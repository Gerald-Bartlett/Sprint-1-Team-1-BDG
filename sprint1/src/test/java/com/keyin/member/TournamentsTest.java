package com.keyin.member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TournamentsTest {
    @Test
    public void testTournamentName(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setTournamentName("Dave's Cash");
        Assertions.assertNotEquals("Provincials",tournamentsUnderTest.getTournamentName());
        Assertions.assertEquals("Dave's Cash", tournamentsUnderTest.getTournamentName());
    }
    @Test
    public void testLocation(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setLocation("Piper's Hole");
        Assertions.assertNotEquals("Big River",tournamentsUnderTest.getLocation());
        Assertions.assertEquals("Piper's Hole", tournamentsUnderTest.getLocation());
    }
    @Test
    public void testEntryFee(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setEntryFee(1500.00);
        Assertions.assertNotEquals(68,tournamentsUnderTest.getEntryFee());
        Assertions.assertEquals(1500.00, tournamentsUnderTest.getEntryFee());
    }
    @Test
    public void testStartDate(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setStartDate("06/24/2022");
        Assertions.assertNotEquals("06/30/2022",tournamentsUnderTest.getStartDate());
        Assertions.assertEquals("06/24/2022", tournamentsUnderTest.getStartDate());
    }
    @Test
    public void testEndDate(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setEndDate("06/27/2022");
        Assertions.assertNotEquals("06/13/2022",tournamentsUnderTest.getEndDate());
        Assertions.assertEquals("06/27/2022", tournamentsUnderTest.getEndDate());
    }
    @Test
    public void testCashPrizeAmount(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setCashPrizeAmount(500.00);
        Assertions.assertNotEquals(2500.00,tournamentsUnderTest.getCashPrizeAmount());
        Assertions.assertEquals(500.00, tournamentsUnderTest.getCashPrizeAmount());
    }

    @Test
    public void testParticipatingMembers(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setParticipatingMembers("dave Temple, Barry Poole, Gerald Bartlett, Mike Tyson");
        Assertions.assertNotEquals("Patrick Roy, Adam Sandler", tournamentsUnderTest.getParticipatingMembers());
        Assertions.assertEquals("dave Temple, Barry Poole, Gerald Bartlett, Mike Tyson",tournamentsUnderTest.getParticipatingMembers());
    }
@Test
    public void testFinalStandings(){
        Tournaments tournamentsUnderTest = new Tournaments();
        tournamentsUnderTest.setFinalStandings("Upcoming");

        Assertions.assertNotEquals("Barry Poole 1st", tournamentsUnderTest.getFinalStandings());
        Assertions.assertEquals("Upcoming", tournamentsUnderTest.getFinalStandings());
}
}
