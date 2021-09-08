package com.company;
import java.util.Scanner;

public class Main {


                    static void compareTo(Double value1, Double value2) {
                        if (value1 == value2) {
                            System.out.println("Both the lines are equal in length.");
                        } else if (value1 > value2) {
                            System.out.println("Line 1 is greater than Line 2");
                        } else {
                            System.out.println("Line 2 is greater than Line 1");
                        }
                    }

                    public static void main(String[] args) {
                        System.out.println("Welcome to Line Comparison Computation Program");
                        Scanner sc = new Scanner(System.in);
                        @@ -30,14 +40,7 @@ public static void main(String[] args) {
                            System.out.println(); // Used for new line
                            System.out.println("Length of the line 1 is : "+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
                            System.out.println("Length of the line 2 is : "+(Math.sqrt(Math.pow((x4-x3),2))+Math.pow((y4-y3) ,2)));

                            System.out.println(); // Used for new line or for empty line
                            if (line1 == line2)
                            {
                                System.out.println("Both the lines are equal in length.");
                            }
                            else {
                                System.out.println("Both lines are unequal in length.");
                            }
                            System.out.println(); // Used for an empty line
                            compareTo(line1, line2);
                        }
                    }





