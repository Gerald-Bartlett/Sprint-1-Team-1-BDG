package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TournamentDatabaseTest<E>extends MemberArrayList {

    @Test
    public void testMemberLastName() {

        Member memberUnderTest = new Member();
        memberUnderTest.setMemberLastName("Bartlett");
        Assertions.assertNotEquals("Hello", memberUnderTest.getMemberLastName());
        Assertions.assertEquals("Bartlett", memberUnderTest.getMemberLastName());
        Assertions.assertEquals(memberUnderTest.getMemberLastName(), memberUnderTest.getMemberLastName());
    }

    @Test
    public void testMemberFirstName() {

        Member memberUnderTest = new Member();
        memberUnderTest.setMemberFirstName("Adam");
        Assertions.assertNotEquals("Sandler", memberUnderTest.getMemberLastName());
        Assertions.assertEquals("Adam", memberUnderTest.getMemberLastName());
        Assertions.assertEquals(memberUnderTest.getMemberLastName(), memberUnderTest.getMemberLastName());
    }

    @Test
    public void testMemberAddress() {

        Member memberUnderTest = new Member();
        memberUnderTest.setMemberAddress("171 Canada Way");
        Assertions.assertEquals("171 Canada Way", memberUnderTest.getMemberAddress());
        Assertions.assertEquals(memberUnderTest.getMemberAddress(), memberUnderTest.getMemberAddress());
    }
}
