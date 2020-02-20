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
public class Calculator {
    public static void main(String args[]){
        double firstNum, secondNum, result;
        char choice;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        
        choice = scanner.next().charAt(0);
        
        switch(choice){
            case '1':
                System.out.println("Enter first number");
                firstNum = scanner.nextDouble();
                System.out.println("Enter second number");
                secondNum = scanner.nextDouble();
                result = firstNum + secondNum;
                System.out.println(result);
                break;
                
            case '2':
                System.out.println("Enter first number");
                firstNum = scanner.nextDouble();
                System.out.println("Enter second number");
                secondNum = scanner.nextDouble();
                result = firstNum - secondNum;
                System.out.println(result);
                break;
                
            case '3':
                System.out.println("Enter first number");
                firstNum = scanner.nextDouble();
                System.out.println("Enter second number");
                secondNum = scanner.nextDouble();
                result = firstNum * secondNum;
                System.out.println(result);
                break;
                
            case '4':
                System.out.println("Enter first number");
                firstNum = scanner.nextDouble();
                System.out.println("Enter second number");
                secondNum = scanner.nextDouble();
                result = firstNum / secondNum;
                System.out.println(result);
                break;
        }
        
        }while(choice !=0);       
        
    }
}
