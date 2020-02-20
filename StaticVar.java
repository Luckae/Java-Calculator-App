/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mac
 */
import java.util.Scanner;
public class StaticVar {
    static int c = 55;
    public static final double PI = 3.142;
    public static void main(String args[]){
       // System.out.println(c);
        //printRes();
        //areaCircle();
        getArea();
         
    }
    
    public static void printRes(){
        System.out.println(c);
         System.out.println(PI);
    }
    
    public static void areaCircle(){
        double radius = 4;
        double result = PI * radius * radius;
        System.out.println(result);
    }
    
    public static void getArea(){
        System.out.println("Enter radius");
        double r;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        
        double res = PI * r * r;
        
        System.out.println("The answer is "+res);
    }
    
    
}
