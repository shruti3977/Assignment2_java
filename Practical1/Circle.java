package Practical1;
//This Program is prepared by 21CE118 Shruti Sangani

/* Aim :: Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it.
 */

public class Circle
{
    public double radius=1;//default radius is one

    Circle()
    {
        double a= radius;
    }
    Circle(double r)
    {
        radius=r;
    }
    public double getarea()//for getting Area
    {
        double area=3.14*radius*radius;
        return area;
    }
    public double getperimeter()//for getting perimeter
    {
        double peri=2*3.14*radius;
        return peri;
    }
}
