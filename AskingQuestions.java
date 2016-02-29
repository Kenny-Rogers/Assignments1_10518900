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
public class AskingQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard= new Scanner(System.in);     
        int age;
        int ft;
        int inch;
        double weight;
        
        System.out.print( "How old are you? " );
	age = keyboard.nextInt();

	System.out.print( "How many feet tall are you? " );
	ft = keyboard.nextInt();
        
        System.out.print( "And how many inches? " );
	inch = keyboard.nextInt();
        
	System.out.print( "How much do you weigh? " );
	weight = keyboard.nextDouble();

	System.out.println( "So you're " + age + " old, "
                            + ft+"\'"+inch+ "\" tall and "+ weight + " heavy.");
    }
    
}
