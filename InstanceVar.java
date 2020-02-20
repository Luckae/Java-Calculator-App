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
public class InstanceVar {
    private double salary;
    private String name;
    
    public InstanceVar(String empName){
        name = empName;
    }
    
    private void setSalary(double sal){
        salary = sal;
    }
    
    public void printEmp(){
        System.out.println("name: "+name);
        System.out.println("salary:"+ salary);
    }
    
    public static void main(String args[]){
        InstanceVar instancevar = new InstanceVar("Lawson Luke");
        instancevar.setSalary(200000);
        instancevar.printEmp();
    }
}
