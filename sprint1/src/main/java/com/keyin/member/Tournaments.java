package com.keyin.member;
public class Tournaments {
    private String tournamentName;
    private String location;
    private double entryFee;
    private String startDate;
    private String endDate;
    private double cashPrizeAmount;
    private String participatingMembers;
    private String finalStandings;
    public Tournaments(String tournamentName, String location, double entryFee, String startDate, String endDate, double cashPrizeAmount, String participatingMembers, String finalStandings) {
        this.tournamentName = tournamentName;
        this.location = location;
        this.entryFee = entryFee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cashPrizeAmount = cashPrizeAmount;
        this.participatingMembers = participatingMembers;
        this.finalStandings = finalStandings;
    }
    public Tournaments() {
    }
    public String getTournamentName() {
        return tournamentName;
    }
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getEntryFee() {
        return entryFee;
    }
    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public double getCashPrizeAmount() {
        return cashPrizeAmount;
    }
    public void setCashPrizeAmount(double cashPrizeAmount) {
        this.cashPrizeAmount = cashPrizeAmount;
    }
    public String getParticipatingMembers(){
        return participatingMembers;
    }
    public void setParticipatingMembers(String participatingMembers){
        this.participatingMembers = participatingMembers;
    }
    public String getFinalStandings(){
        return finalStandings;
    }
    public void setFinalStandings(String finalStandings){
        this.finalStandings = finalStandings;
    }
    public String toString() {
        return("Tournament Name: " + getTournamentName() + "\n" + "Location: " + getLocation() +
                "\n" + "Entry Fee: $" + getEntryFee() + "\n" + "Start Date: " + getStartDate() + " - " + "End Date: " + getEndDate()
                + "\n" + "Prize Payout : $" + getCashPrizeAmount() + "\n" + "Participating Members: " + getParticipatingMembers() + "\n" +
                "Final Standings: " + getFinalStandings() + "\n\n");
    }
}
