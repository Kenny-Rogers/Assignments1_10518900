/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author kenny
 */
public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
	int cars = 40;
	int buses = 15;
        
        /*
        (1)else if executes the block of statements if the condition is true 
        after the if condition evaluates to false.
        else executes the block of statements after the all if and else if 
        statements has failed
        
        (2)it doesnot execute the statement because the condition is false
        */
        
	if ( cars > people )
	{
            System.out.println( "We should take the cars." );
	}
	if ( cars < people )
	{
	     System.out.println( "We should not take the cars." );
	}
	else
	{
	     System.out.println( "We can't decide." );
	}


	if ( buses > cars )
	{
             System.out.println( "That's too many buses." );
	}
	else if ( buses < cars )
	{
             System.out.println( "Maybe we could take the buses." );
	}
	else
	{
	     System.out.println( "We still can't decide." );
	}


	if ( people > buses )
	{
	     System.out.println( "All right, let's just take the buses." );
	}
	else
	{
	     System.out.println( "Fine, let's stay home then." );
	}

    }
    
}
