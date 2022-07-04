package com.keyin.member;


import java.time.LocalDate;
import java.time.Period;

public class Member {

    private String memberFirstName;
    private String memberLastName;
    private String memberAddress;
    private String email;
    private String phoneNumber;
    private String membershipType;
    private static LocalDate startDate;
    private String duration;
//    private LocalDate todaysDate;

    public Member() {
    }
    public Member(String memberFirstName, String memberLastName, String memberAddress, String email, String phoneNumber,String membershipType, LocalDate startDate){
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberAddress = memberAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membershipType = membershipType;
        this.startDate = startDate;


    }
    public String getMemberFirstName(){

        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {

        this.memberFirstName = memberFirstName;
    }

    public  String getMemberLastName(){
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public  String getMemberAddress(){
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public  String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setMembershipType(String membershipType) {
        this.membershipType =  membershipType;
    }
    public String getMembershipType(){
        return membershipType;
    }

    public void  setStartDate(LocalDate date) {
        this.startDate = date;
    }
    public static LocalDate getStartDate(){
        return startDate;
    }




    public String getDuration(){
//        LocalDate startDate = LocalDate.of(2020, Month.JUNE, 21);
        LocalDate today = LocalDate.now();
        Period time = Period.between(startDate, today);
        int years = time.getYears();
        int months = time.getMonths();
        int days = time.getDays();
        duration = ("Years: " + years +", " + " Months: " + months + ", " + "Days: " + days);
        return duration;
    }
public String toString() {
        return("First Name: " + getMemberFirstName() + " , " + "Last Name: " + getMemberLastName() +"\n" +
                  "Address: " +getMemberAddress() + " , " + "Email" + getEmail() + " , " + "Phone Number: " + getPhoneNumber() + "\n" + "Membership Type: " + getMembershipType() + "\n" + "Length of Membership: " + getDuration()  + "\n\n");
      }

 }




  