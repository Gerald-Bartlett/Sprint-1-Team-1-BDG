package com.keyin.member;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemberDatabase extends Member {

    public ArrayList<Member> members;

    public ArrayList<Member> allMembers() {

        members = new ArrayList<Member>();

        Member m1 = new Member("Dave", "Temple", "5 Thomas Gardens",
                "dave@dave.com", "709-555-7777", "Normal", LocalDate.of(2011, 6, 20));
        members.add(m1);
        Member m2 = new Member("Gerald", "Bartlett", "100 Out-Of-The Way",
                "gerald@gerald.com", "709-555-4444", "Trial", LocalDate.of(2021, 12, 31));
        members.add(m2);
        Member m3 = new Member("Barry", "Poole", "5 Magical Place",
                "barry@barry.com", "709-555-3333", "Special Offer", LocalDate.of(2022, 6, 12));
        members.add(m3);
        Member m4 = new Member("Jamie", "Cornick", "1 George Street",
                "jamie@jamie.com", "709-555-2222", "Family Plan",LocalDate.of(2013, 8, 18));
        members.add(m4);
        Member m5 = new Member("Peter", "Rawsthorne", "10 High Way",
                "peter@peter.com", "709-555-1111", "Other", LocalDate.of(1999, 12, 21));
        members.add(m5);
        Member m6 = new Member("Maurice", "Babin", "5 In-Da Way",
                "maurice@maurice.com", "709-555-8888", "Trial", LocalDate.of(2020, 12, 11));
        members.add(m6);
        Member m7 = new Member("Mike", "Tyson", "3 Staying-Out-Of Court",
                "mike@mike.com", "709-555-9999", "Normal", LocalDate.of(1999, 12, 4));
        members.add(m7);
        Member m8 = new Member("Patrick", "Roy", "6 Hockey de Street",
                "patrick@patrick.com", "709-555-5555", "Normal", LocalDate.of(1999, 12, 6));
        members.add(m8);
        Member m9 = new Member("Adam", "Sandler", "23 Basketball Court",
                "adam@adam.com", "709-555-6666", "Normal", LocalDate.of(1999, 12, 5));
        members.add(m9);
        return members;
    }

        public void setMembers (ArrayList members){
            this.members = members;
        }
        public ArrayList getMembers () {
            return members;
        }
    }




