package com.keyin.member;
import java.util.ArrayList;
import java.util.Scanner;
public class MemberServices extends MemberDatabase {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        int v = 0;
        System.out.println("------------------------------------------------------");
        System.out.println("-------WELCOME TO OUR Golf Club MANAGEMENT SYSTEM-------");
        System.out.println("------------------------------------------------------");
        System.out.println("----------Please choose one of below Options----------");
        System.out.println("1. View Individual Accounts");
        System.out.println("2. View Individual Tournaments");
        System.out.println("3. View All Accounts");
        System.out.println("4. View All Tournaments");
        System.out.println("5. Remove Account");

        System.out.println();
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        switch (x) {
            case 1 -> {
                System.out.println("Please select a Member between 1- 9");
                Scanner input2 = new Scanner(System.in);
                y = input2.nextInt();

                switch (y) {
                    case 1:
                        MemberDatabase memberInstance = new MemberDatabase();
                        memberInstance.allMembers();
                        ArrayList<Member> members = memberInstance.getMembers();
                        Member findMember = members.get(0);
                        findMember.toString();
                        System.out.println(findMember);
                        break;
                    case 2:
                        MemberDatabase memberInstance1 = new MemberDatabase();
                        memberInstance1.allMembers();
                        ArrayList<Member> members1 = memberInstance1.getMembers();
                        Member findMember1 = members1.get(1);
                        findMember1.toString();
                        System.out.println(findMember1);
                        break;
                    case 3:
                        MemberDatabase memberInstance2 = new MemberDatabase();
                        memberInstance2.allMembers();
                        ArrayList<Member> members2 = memberInstance2.getMembers();
                        Member findMember2 = members2.get(2);
                        findMember2.toString();
                        System.out.println(findMember2);
                        break;
                    case 4:
                        MemberDatabase memberInstance3 = new MemberDatabase();
                        memberInstance3.allMembers();
                        ArrayList<Member> members3 = memberInstance3.getMembers();
                        Member findMember3 = members3.get(3);
                        findMember3.toString();
                        System.out.println(findMember3);
                        break;
                    case 5:
                        MemberDatabase memberInstance4 = new MemberDatabase();
                        memberInstance4.allMembers();
                        ArrayList<Member> members4 = memberInstance4.getMembers();
                        Member findMember4 = members4.get(4);
                        findMember4.toString();
                        System.out.println(findMember4);
                        break;
                    case 6:
                        MemberDatabase memberInstance5 = new MemberDatabase();
                        memberInstance5.allMembers();
                        ArrayList<Member> members5 = memberInstance5.getMembers();
                        Member findMember5 = members5.get(5);
                        findMember5.toString();
                        System.out.println(findMember5);
                        break;
                    case 7:
                        MemberDatabase memberInstance6 = new MemberDatabase();
                        memberInstance6.allMembers();
                        ArrayList<Member> members6 = memberInstance6.getMembers();
                        Member findMember6 = members6.get(6);
                        findMember6.toString();
                        System.out.println(findMember6);
                        break;
                    case 8:
                        MemberDatabase memberInstance7 = new MemberDatabase();
                        memberInstance7.allMembers();
                        ArrayList<Member> members7 = memberInstance7.getMembers();
                        Member findMember7 = members7.get(7);
                        findMember7.toString();
                        System.out.println(findMember7);
                        break;
                    case 9:
                        MemberDatabase memberInstance8 = new MemberDatabase();
                        memberInstance8.allMembers();
                        ArrayList<Member> members8 = memberInstance8.getMembers();
                        Member findMember8 = members8.get(8);
                        findMember8.toString();
                        System.out.println(findMember8);
                        break;
                }
            }
            case 2 -> {
                System.out.println("Please Select a Tournament between 1-8");
                Scanner input3 = new Scanner(System.in);
                z = input3.nextInt();
                switch (z) {
                    case 1 -> {
                        TournamentsDatabase tournamentsInstance = new TournamentsDatabase();
                        tournamentsInstance.allTournaments();
                        ArrayList<Tournaments> tournaments = tournamentsInstance.getTournaments();
                        Tournaments findTournaments = tournaments.get(0);
                        findTournaments.toString();
                        System.out.println(findTournaments);
                        break;
                    }
                    case 2 -> {
                        TournamentsDatabase tournamentsInstance1 = new TournamentsDatabase();
                        tournamentsInstance1.allTournaments();
                        ArrayList<Tournaments> tournaments1 = tournamentsInstance1.getTournaments();
                        Tournaments findTournaments1 = tournaments1.get(1);
                        findTournaments1.toString();
                        System.out.println(findTournaments1);
                        break;
                    }
                    case 3 -> {
                        TournamentsDatabase tournamentsInstance2 = new TournamentsDatabase();
                        tournamentsInstance2.allTournaments();
                        ArrayList<Tournaments> tournaments2 = tournamentsInstance2.getTournaments();
                        Tournaments findTournaments2 = tournaments2.get(2);
                        findTournaments2.toString();
                        System.out.println(findTournaments2);
                        break;
                    }
                    case 4 -> {
                        TournamentsDatabase tournamentsInstance3 = new TournamentsDatabase();
                        tournamentsInstance3.allTournaments();
                        ArrayList<Tournaments> tournaments3 = tournamentsInstance3.getTournaments();
                        Tournaments findTournaments3 = tournaments3.get(3);
                        findTournaments3.toString();
                        System.out.println(findTournaments3);
                        break;
                    }
                    case 5 -> {
                        TournamentsDatabase tournamentsInstance4 = new TournamentsDatabase();
                        tournamentsInstance4.allTournaments();
                        ArrayList<Tournaments> tournaments4 = tournamentsInstance4.getTournaments();
                        Tournaments findTournaments4 = tournaments4.get(4);
                        findTournaments4.toString();
                        System.out.println(findTournaments4);
                        break;
                    }
                    case 6 -> {
                        TournamentsDatabase tournamentsInstance5 = new TournamentsDatabase();
                        tournamentsInstance5.allTournaments();
                        ArrayList<Tournaments> tournaments5 = tournamentsInstance5.getTournaments();
                        Tournaments findTournaments5 = tournaments5.get(5);
                        findTournaments5.toString();
                        System.out.println(findTournaments5);
                        break;
                    }
                    case 7 -> {
                        TournamentsDatabase tournamentsInstance6 = new TournamentsDatabase();
                        tournamentsInstance6.allTournaments();
                        ArrayList<Tournaments> tournaments6 = tournamentsInstance6.getTournaments();
                        Tournaments findTournaments6 = tournaments6.get(6);
                        findTournaments6.toString();
                        System.out.println(findTournaments6);
                        break;
                    }
                    case 8 -> {
                        TournamentsDatabase tournamentsInstance7 = new TournamentsDatabase();
                        tournamentsInstance7.allTournaments();
                        ArrayList<Tournaments> tournaments7 = tournamentsInstance7.getTournaments();
                        Tournaments findTournaments7 = tournaments7.get(7);
                        findTournaments7.toString();
                        System.out.println(findTournaments7);
                        break;
                    }
                }

            }

            case 3 -> {
                System.out.println("All Accounts in Database");
                System.out.println();
                MemberDatabase memberInstance = new MemberDatabase();
               memberInstance.allMembers();
                ArrayList<Member> members = memberInstance.getMembers();
                for (int print = 0; print < members.size(); print++) {
                    System.out.print(members.get(print));
            }
            }
            case 4 -> {
                System.out.println("All Tournaments in Database");
                System.out.println();
                TournamentsDatabase tournamentsInstance = new TournamentsDatabase();
                tournamentsInstance.allTournaments();
                ArrayList<Tournaments> tournaments = tournamentsInstance.getTournaments();
                for (int print = 0; print < tournaments.size(); print++) {
                    System.out.print(tournaments.get(print));


                }
            }
            case 5 -> {
                System.out.println(" Enter Membership Account to Delete from 1-9");
                Scanner input4 = new Scanner(System.in);
                w = input4.nextInt();
                switch (w) {
                    case 1:

                        MemberDatabase memberInstance = new MemberDatabase();
                        memberInstance.allMembers();
                        ArrayList<Member> members = memberInstance.getMembers();
                        Member removeMember = members.remove(0);
                        removeMember.toString();
                        System.out.println(removeMember);
                        break;
                    case 2:
                        MemberDatabase memberInstance1 = new MemberDatabase();
                        memberInstance1.allMembers();
                        ArrayList<Member> members1 = memberInstance1.getMembers();
                        Member removeMember1 = members1.remove(1);
                        removeMember1.toString();
                        System.out.println(removeMember1);
                        break;
                    case 3:
                        MemberDatabase memberInstance2 = new MemberDatabase();
                        memberInstance2.allMembers();
                        ArrayList<Member> members2 = memberInstance2.getMembers();
                        Member removeMember2 = members2.remove(2);
                        removeMember2.toString();
                        System.out.println(removeMember2);
                        break;
                    case 4:
                        MemberDatabase memberInstance3 = new MemberDatabase();
                        memberInstance3.allMembers();
                        ArrayList<Member> members3 = memberInstance3.getMembers();
                        Member findMember3 = members3.remove(3);
                        findMember3.toString();
                        System.out.println(findMember3);
                        break;
                    case 5:
                        MemberDatabase memberInstance4 = new MemberDatabase();
                        memberInstance4.allMembers();
                        ArrayList<Member> members4 = memberInstance4.getMembers();
                        Member findMember4 = members4.remove(4);
                        findMember4.toString();
                        System.out.println(findMember4);
                        break;
                    case 6:
                        MemberDatabase memberInstance5 = new MemberDatabase();
                        memberInstance5.allMembers();
                        ArrayList<Member> members5 = memberInstance5.getMembers();
                        Member findMember5 = members5.remove(5);
                        findMember5.toString();
                        System.out.println(findMember5);
                        break;
                    case 7:
                        MemberDatabase memberInstance6 = new MemberDatabase();
                        memberInstance6.allMembers();
                        ArrayList<Member> members6 = memberInstance6.getMembers();
                        Member findMember6 = members6.remove(6);
                        findMember6.toString();
                        System.out.println(findMember6);
                        break;
                    case 8:
                        MemberDatabase memberInstance7 = new MemberDatabase();
                        memberInstance7.allMembers();
                        ArrayList<Member> members7 = memberInstance7.getMembers();
                        Member findMember7 = members7.remove(7);
                        findMember7.toString();
                        System.out.println(findMember7);
                        break;
                    case 9:
                        MemberDatabase memberInstance8 = new MemberDatabase();
                        memberInstance8.allMembers();
                        ArrayList<Member> members8 = memberInstance8.getMembers();
                        Member findMember8 = members8.remove(8);
                        findMember8.toString();
                        System.out.println(findMember8);
                        break;
                }
            }

                default -> System.out.println("Wrong Selection Try again");

            }
        }
    }










