package com.company;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
//import : w=3

public class Main {

    public static void main(String[] args) {
        //Parameters : w=1
        Scanner key = new Scanner(System.in);
        //Operators : w=2
        // Parameters : w=1
        // Object : w=2

        int nic = 0;
        //Variables : w=3
        //Operators : w=1

        System.out.println("------------Generate Company User ID------------");
        //Operators : w=2
        // Parameters : w=1
        // Function call : w=2

        System.out.print("Enter NIC Number (Without letters): ");
        //Operators : w=2
        // Parameters : w=1
        // Function call : w=2

        try {
            nic = key.nextInt();
            //Operators : w=2
            // Function call : w=2

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. ID Generation fail!");
            //Operators : w=2
            // Parameters : w=1
            // Function call : w=2

            System.exit(-99);
            //Operators : w=1
            // Parameters : w=1
            // Function call : w=2

        } catch (Exception e) {
            e.printStackTrace();
            //Operators : w=1
            // Function call : w=2
        }


        IidGenerator idGenerator = new IdGenerator();
        //Operators : w=1
        // Object : w=2

        System.out.println("Your ID is : " + idGenerator.generate(nic));
        //Operators : w=3
        // Parameters : w=1
        // access via interface = 3
        // Function call : w=2

        System.out.println("Thank You!");
        //Operators : w=2
        // Parameters : w=1
        // Function call : w=2

    }
}

class IdGenerator implements IidGenerator {
    public String generate(int nic) {
        //Method parameter : w=1

        String CompanyID;
        //Variables : w=2

        int lastNumsOfNic = nic % 10000;
        //Operators : w=2
        // Variables : w=3

        String lastNum = String.valueOf(lastNumsOfNic);
        //casting : w=1
        // Operators : w=2
        // Parameters : w=1
        // Variables : w=3
        // Function call : w=2

        CompanyID = "SLIIT_" + Calendar.getInstance().get(Calendar.YEAR) + "_" + lastNum;
        //Operators : w=7
        // Parameters : w=1
        // Variables : w=3

        return CompanyID;
    }
}

interface IidGenerator {
    String generate(int nic);
}
//Control structure : w=1
//try catch : w=2
//lines of code : w=1(before comments)