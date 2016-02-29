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
public class AgeinFiveYears {
    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    String name="";
    int age=0;
    
    System.out.print("Hello. What is your name? ");
    name=input.nextLine();
    System.out.print("\nHi, "+name+"! How old are you? ");
    age=input.nextInt();
    System.out.println("\nDid you know that in five years you will be "
                       +(age+5)+" years old?");
    System.out.println("And five years ago you were "+(age-5)+"! Imagine that!");
    }
}
