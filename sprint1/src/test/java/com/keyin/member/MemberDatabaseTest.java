package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class MemberDatabaseTest {
    private Object ArrayList;

    @Test
    public void testMemberLastName() {

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals("Hello", memberUnderTest.getMemberLastName());
        Assertions.assertEquals(memberUnderTest.getMemberLastName(), memberUnderTest.getMemberLastName());
    }

    @Test
    public void testMemberFirstName() {

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals("Rawsthorne", memberUnderTest.getMemberLastName());
        Assertions.assertEquals(memberUnderTest.getMemberLastName(), memberUnderTest.getMemberLastName());
    }

    @Test
    public void testMemberAddress(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals("171 Canada Way",memberUnderTest.getMemberAddress());

        Assertions.assertEquals(memberUnderTest.getMemberAddress(), memberUnderTest.getMemberAddress());
    }
}




