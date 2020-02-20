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
public class NewClass {
    public static void main(String args[]){
        System.out.println("This is a Java Program");
        NewClass newClass = new NewClass();
       // newClass.myMeth();
        //newClass.myMeth2();
        
//        String name;
//        int age;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello\n Please enter your name");
//        name = scanner.nextLine();
//        
//        System.out.println("Welcome "+name);
//        
//        System.out.println("How old are you?");
//        age = scanner.nextInt();
//        
//        System.out.println("Welcome "+name+ " You are "+age);
        
        System.out.println(newClass.myMeth3(10, 5));

        
        
    }
     void myMeth(){
        System.out.println("This is a method");
    }
     
     void myMeth2(){
         myMeth();
     }
     
    int myMeth3(int a, int b){
         return a + b;
     }
}
