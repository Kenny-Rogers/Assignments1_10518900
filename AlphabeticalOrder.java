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
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String lName="";
        String outline="";
        
        System.out.print("Please enter your last name? ");
        lName=input.nextLine();
        if(lName.compareTo("Carswell")>=0){
            outline="You don't have to wait long";
        }
        else if(lName.compareTo("Jones")>=0){
            outline="That's not bad";
        }
        else if(lName.compareTo("Smith")>=0){
            outline="Looks like a bit of a wait";
        }
        else if(lName.compareTo("Young")>=0){
            outline="It's gonna be a while";
        }else if(lName.compareTo("Young")<0){
            outline="Not going anywhere for a while";
        }
        
        System.out.println("\n "+outline+", "+lName);
    }
    
}
