package Practical1;
//This Program is prepared by 21CE118 Shruti Sangani

/* Aim :: Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it.
 */

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Circle c=new Circle();//default Constructor
        System.out.println("Area of the Circle is :: "+c.getarea()+" by default constructor");
        System.out.println("Perimeter of the Circle is :: "+c.getperimeter()+" by default constructor");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius :: ");//Enter the radius
        int r= sc.nextInt();
        Circle c1=new Circle(r);//Parameterized Constructor
        System.out.println("Area of the Circle :: "+c1.getarea()+" by one argument constructor");
        System.out.println("Perimeter of the Circle is :: "+c1.getperimeter()+" by one argument constructor");
    }
}