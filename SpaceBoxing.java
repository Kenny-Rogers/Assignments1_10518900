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
public class SpaceBoxing {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double weight;
        double ans=0.0;
        int option;
       
        
        System.out.print("Please enter your current earth weight: ");
        weight=input.nextDouble();
        System.out.println("\nI have information for the following planets");
        System.out.println("\t1. Venus      2. Mars     3. Jupiter");
        System.out.println("\t4. Saturn     5. Uranus   6. Neptune");
        System.out.print("\nWhich planet are you visiting? ");
        option=input.nextInt();
        
        if(option==1){
         //1. Venus
         ans=0.78;
        }
        else if(option==2){  
            //2. Mars
        ans=0.39;
        }
        else if(option==3){
        //3. Jupiter
        ans=2.65;
        }
        else if(option==4){
        //4. Saturn
        ans=1.17;
        }
        else if(option==5){
        //5.Uranus
        ans=1.05;
        }
        else if(option==6){
        //6. Neptune
        ans=1.23;
        }
      
        
        System.out.println("\nYour weight would be "+(ans*weight)
                +" pounds on that planet.");
    }
    
}
