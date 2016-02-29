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
public class NameAgeSalary {
    
    public static void main(String [] args){
        Scanner keyboard=new Scanner(System.in);
        String name="";
        int age=0;
        double pay=0.0;
        
        
        System.out.println("Hello. what is your name?");
        name=keyboard.nextLine();
        
        System.out.println("Hi, "+name+"! How old are you?");
        age=keyboard.nextInt();
        
        System.out.println("So you're "+age+" eh? That's not old at all!");
        System.out.println("How much do you make, "+name+ "?");
        pay=keyboard.nextDouble();
        
        System.out.println(pay+"! I hope that's per hour and not per year! LOL!");
        
    }
}
