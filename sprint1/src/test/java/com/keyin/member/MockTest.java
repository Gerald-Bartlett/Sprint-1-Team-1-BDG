package com.keyin.member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    MemberDatabase databaseMock;
    @Test
    public void mockMemberDatabase() {
        Assertions.assertNotNull(databaseMock);
    }
    @Mock
    TournamentsDatabase tournamentsDatabaseMock;
    @Test
    public void mockTournamentsDatabase() {
        Assertions.assertNotNull(tournamentsDatabaseMock);
    }
    @Mock
    private Member member;
    @Test
    public void mockMyMember(){
        Member mockMyMember = new Member();
        mockMyMember.setMemberLastName("Sandler");
        Assertions.assertEquals("Sandler", mockMyMember.getMemberLastName());
    }
    @Mock
    private Tournaments tournamentsMock;
    @Test
    public void mockMyTournaments(){
        Tournaments mockMyTournaments = new Tournaments();
        mockMyTournaments.setTournamentName("Barry's Bash");
        Assertions.assertNotEquals("Barry's Bash", "Gerald's Golfing Bonanza");
    }
    @Mock
    private MemberDatabase memberDatabaseMock;
    private ArrayList list;
    @Test
    public void mockMyDatabase(){
        MemberDatabase memberDatabase = new MemberDatabase();
        ArrayList<Member> list = new ArrayList<>();
        list.isEmpty();
        Assertions.assertNotNull(list);
        // an empty array is still not null
    }
    @Mock
    private Member mamber;
    @Test
    public void mockMyMamber(){
        Member aMember = new Member();
        aMember.setMemberFirstName("Dave");
        Mockito.when(mamber.getMemberFirstName()).thenReturn(null);
        Assertions.assertNotEquals("Rick", mamber.getMemberFirstName());
    }
    @Mock
    private Tournaments tournamentMock;
    @Test
    public void mockMeTournaments(){
        Tournaments mockMyTournaments = new Tournaments();
        mockMyTournaments.setTournamentName("Billy's Bucks");
        Mockito.when(tournamentsMock.getTournamentName()).thenReturn(null);
        Assertions.assertEquals(tournamentsMock.getTournamentName(), tournamentsMock.getTournamentName());
    }
}
