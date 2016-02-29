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
public class BmiCategories {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double bmi=0;
        if(bmi<18.5){
            System.out.println("Bmi Category: "+bmi);
        }
        if((bmi<=24.9)&&(bmi>=18.5)){
            System.out.println("Bmi Category: "+bmi);
        }
        if((bmi<=25)&&(bmi>=29.9)){
            System.out.println("Bmi Category: "+bmi);
        }
        if(bmi>=30){
            System.out.println("Bmi Category: "+bmi);
        }
    }
    
}
