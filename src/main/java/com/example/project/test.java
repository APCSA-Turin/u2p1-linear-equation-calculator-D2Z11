package com.example.project;


public class test {
    public static void main(String[] args) {
        LinearCalculator c = new LinearCalculator("(10,5)","(6,-1)");
        String expectedOutput = "The two points are: (10,5)";
        expectedOutput += " and " + "(6,-1)";
        expectedOutput += "\nThe equation of the line between these points is: y=1.5x-10.0";
        expectedOutput += "\nThe slope of this line is: 1.5";
        expectedOutput += "\nThe y-intercept of the line is: -10.0";
        expectedOutput += "\nThe distance between the two points is: 7.21";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();

        System.out.println(studentOutput);
        System.out.println(expectedOutput);
    }
}