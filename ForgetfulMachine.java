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
public class ForgetfulMachine {
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Give me a word ");
        keyboard.nextLine();
        
        System.out.println("Give me a second word ");
        keyboard.nextLine();
        
        System.out.println("Great, now your favorite number");
        keyboard.nextDouble();
        
        System.out.println("And your second-favorite number...");
        keyboard.nextDouble();
        
        System.out.println("Whew! Wasn't that fun?");
        
    }
}
