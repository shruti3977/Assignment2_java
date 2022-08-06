package Practical5;
//This Program is prepared by 21CE118 Shruti Sangani

import java.util.Scanner;

/* Aim :: Develop a Program that illustrate method overloading concept.
 */
public class Practical5 {
    void Multiplication(int a, int b){
        int mul;
        mul=a*b;
        System.out.println("The Multiplication of the numbers is :"+mul);
    }
    void Multiplication(float a,float b){
        float mul;
        mul=a*b;
        System.out.println("The Multiplication of the numbers is :"+mul);
    }
    void Multiplication(Double a,Double b){
        double mul;
        mul=a*b;
        System.out.println("The Multiplication of the numbers is :"+mul);
    }
    public static void main(String[] args) {
        Practical5 p1=new Practical5();
        p1.Multiplication(3, 7);
        p1.Multiplication(3.9, 7.7);
        p1.Multiplication(3.977, 7.739);
    }
}

