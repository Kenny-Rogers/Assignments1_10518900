/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class ADumbCalculator {
    public static void main(String[] args){
        double num1=0.0;
        double num2=0.0;
        double num3=0.0;
        Scanner input=new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        num1=input.nextDouble();
        System.out.print("What is your second number? ");
        num2=input.nextDouble();
        System.out.print("What is your third number? ");
        num3=input.nextDouble();
        
        System.out.println("( "+num1+" + "+ num2+" + " + num3 +" ) / "+2
                        +" is... "+((num1+num2+num3)/2));
    } 
    
}
