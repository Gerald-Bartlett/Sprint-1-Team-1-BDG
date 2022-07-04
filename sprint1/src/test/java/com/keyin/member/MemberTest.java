package com.keyin.member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MemberTest {
    @Test
    public void testMemberFirstName(){
        Member memberUnderTest = new Member();
        memberUnderTest.setMemberFirstName("Barry");
        Assertions.assertNotEquals("Dave",memberUnderTest.getMemberFirstName());
        Assertions.assertEquals("Barry", memberUnderTest.getMemberFirstName());
    }
    @Test
    public void testMemberLastName(){
        Member memberUnderTest = new Member();
        memberUnderTest.setMemberLastName("Poole");
        Assertions.assertNotEquals("Bartlett",memberUnderTest.getMemberLastName());
        Assertions.assertEquals("Poole", memberUnderTest.getMemberLastName());
    }
    @Test
    public void testMemberAddress(){
        Member memberUnderTest = new Member();
        memberUnderTest.setMemberAddress("69 Yum");
        Assertions.assertNotEquals("55 Speed",memberUnderTest.getMemberAddress());
        Assertions.assertEquals("69 Yum", memberUnderTest.getMemberAddress());
    }
    @Test
    public void testEmail(){
        Member memberUnderTest = new Member();
        memberUnderTest.setEmail("gerald@gerald.com");
        Assertions.assertNotEquals("dave@dave.com",memberUnderTest.getEmail());
        Assertions.assertEquals("gerald@gerald.com", memberUnderTest.getEmail());
    }
    @Test
    public void testPhoneNumber(){
        Member memberUnderTest = new Member();
        memberUnderTest.setPhoneNumber("7092294527");
        Assertions.assertNotEquals("7097463458",memberUnderTest.getPhoneNumber());
        Assertions.assertEquals("7092294527", memberUnderTest.getPhoneNumber());
    }
    @Test
    public void testMembershipType(){
        Member memberUnderTest = new Member();
        memberUnderTest.setMembershipType("Normal");
        Assertions.assertNotEquals("other", memberUnderTest.getMembershipType());
        Assertions.assertEquals("Normal",memberUnderTest.getMembershipType());
    }

}