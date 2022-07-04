package com.keyin.member;
import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MemberArrayList {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<String>();
        ArrayList<String> lastName = new ArrayList<String>();
        ArrayList<String> memberId = new ArrayList<String>();;
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> phone = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);
        String answer = " ";

        {
            do {
                System.out.println("Please enter Member First Name: ");
                firstName.add(scanner.next());
                System.out.println("Please enter Member Last Name: ");
                lastName.add(scanner.next());
                System.out.println("Please enter Member Id number: ");
                memberId.add(scanner.next());
                System.out.println("Please enter Member Email: ");
                email.add(scanner.next());
                System.out.println("Please enter Member phone: ");
                phone.add(scanner.next());
                System.out.println("Do you want to add a Member yes/no?");
                answer = scanner.next();
            } while (answer.equals("yes"));
            if (answer.equals("yes")) ; //want it to go back to start another directory here
            else {
                System.out.println("Thanks for adding to the Members directory");

                System.out.println("");
                for (int i = 0; i < firstName.size(); i++) {

                    System.out.print("First Name " + firstName.get(i) + "\t");
                    System.out.print("Last Name " + lastName.get(i) + "\t");
                    System.out.print("Member Id " + memberId.get(i) + "\t");
                    System.out.print("Email " + email.get(i) + "\t");
                    System.out.print("Phone " + phone.get(i) );
                    System.out.println("");
                }
//                Path output = Paths.get("/Users/MXZ User/Desktop/MemberArrayOutput.txt");
                String output_path = "/Users/MXZ User/Desktop/SD_Architecture_&_Design/SDAT_Week_6/sprint1/src/main/java/com/keyin/member/MemberArrayOutput.txt";
                Path output = Paths.get(output_path);
                try {
                    String newline = System.getProperty("line.separator");
                    StringBuilder str = new StringBuilder();
                    str.append("First Name: " + firstName ).append(newline );
                    str.append("Last Name: " + lastName ).append(newline  );
                    str.append("Member Id: " + memberId ).append(newline );
                    str.append("Email: " + email ).append(newline );
                    str.append("Phone: " + phone );
                    if(new File(output_path).isFile()) {
                        Files.write(output, Collections.singleton(str.toString()), StandardOpenOption.APPEND);
                    }
                    else {
                        Files.write(output, Collections.singleton(str.toString()));
                    }

                    System.out.format(output.toFile().getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            }
        }
    }

