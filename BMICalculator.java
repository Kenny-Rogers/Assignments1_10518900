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
public class BMICalculator {
    
       private static double bmiCalc(double mass, double height){
        height=(double) Math.round(height);
        mass=(double) Math.round(mass);
       double ans=(double) Math.round(mass/(height*height));
        return ans;
    }
    
    private static void incPndConv(double inc,double pound){
        inc=(1/0.0254)*inc;
        pound=(1/2.2046)*pound;
    }
    
    private static void ftIncPdConv(double ft, double inc, double pd){
        incPndConv(inc,pd);
        ft=(1/3.2808)*ft;
    }
    
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    float met=(float) 0.0;
    float kg=(float) 0.0;
    float ans=(float) 0.0;
    
    System.out.print("Your height in m: ");
    met=input.nextFloat();
    System.out.print("Your weight in kg: ");
    kg=input.nextFloat();
    
    System.out.print("\nYour BMI is "+bmiCalc(met,kg)+"\n\n");
    
    System.out.print("Your height in inches: ");
    met=input.nextFloat();
    System.out.print("Your weight in pounds: ");
    kg=input.nextFloat();
    incPndConv(met,kg);
    
    System.out.println("\nYour BMI is "+ bmiCalc(met,kg)+"\n\n");
    System.out.print("Your height (feet only): ");
    double ft=input.nextDouble();
    System.out.print("Your height (inches): ");
    met=input.nextFloat(); 
    System.out.print("Your weight in kg: ");
    kg=input.nextFloat();
    ftIncPdConv(ft, met, kg);
    
    System.out.println("\nYour BMI is "+ bmiCalc(met,kg));
    
    }
 
}
