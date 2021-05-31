package com.company;

import java.util.Scanner;
//import : w=1

public class Main {
    public static void main(String[] args) {
        //Parameters : w=1

        Scanner sc = new Scanner(System.in);
        //Operators : w=2
        // Parameters : w=1
        // Object : w=2

        String mark1StringValue;
        //Variables : w=2

        float mark2, mark3, mark1;
        //Variables : w=6

        System.out.println("Enter 3 marks");
        //Operators : w=2
        // Parameters : w=1
        // Function call : w=2

        mark1StringValue = sc.nextLine();
        //Operators : w=2
        // Function call : w=2

        mark2 = sc.nextFloat();
        //Operators : w=2
        // Function call : w=2

        mark3 = sc.nextFloat();
        //Operators : w=2
        // Function call : w=2

        mark1 = Float.parseFloat(mark1StringValue);
        //Operators : w=2
        // Function call : w=2
        //casting : w=1
        // Parameters : w=1

        CalcAverage ob = new Calculator();
        //Operators : w=1
        // Object : w=2

        float average = ob.calcAverage(mark1, mark2, mark3);
        //Operators : w=3
        // Parameters : w=1
        // access via interface = 3
        // Function call : w=2

        System.out.println("Average is " + average);
        //Operators : w=3
        // Parameters : w=1
        // Function call : w=2

        if (average >= 80 && average <= 100) {
            //Operators : w=3

            System.out.println("Grade is an A");
            //Operators : w=2
            // Parameters : w=1
            // Function call : w=2

        } else if (average >= 60) {
            //Operators : w=1

            System.out.println("Grade is a B");
            //Operators : w=2
            // Parameters : w=1
            // Function call : w=2

        } else if (average >= 45) {
            //Operators : w=1

            System.out.println("Grade is a C");
            //Operators : w=2
            // Parameters : w=1
            // Function call : w=2

        } else if (average >= 0) {
            //Operators : w=1

            System.out.println("Fail. Dont give up! Try again!!");
            //Operators : w=2
            // Parameters : w=1
            // Function call : w=2

        } else System.out.println("Invalid");
        //Operators : w=2
        // Parameters : w=1
        // Function call : w=2
    }
}

class Calculator implements CalcAverage {
    public float calcAverage(float mark1, float mark2, float mark3) {
        //Method parameter : w=3

        float average;
        //Variables : w=2
        //Operators : w=1

        float total = mark1 + mark2 + mark3;
        //Variables : w=3
        //Operators : w=3

        average = total / 3;
        //Operators : w=2

        return average;
    }
}

interface CalcAverage {
    float calcAverage(float mark1, float mark2, float mark3);
}
//Control structure : w=9
//lines of code : w=1(before comments)