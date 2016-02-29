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
public class LittleQuiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans1;
        int count=0;
        
        System.out.print("Are you ready for the quiz?");
        input.next();
        System.out.println("Okay, here it comes!");
        System.out.println("\nQ1) What is the capital ofAlaska?");
        System.out.println("\t1) Melbourne \n\t2)Anchorage \n\t3)Juneau");
        ans1=input.nextInt();
        
        if(ans1== 3){
            System.out.println("That's right");
            count++;
        }
        else{
            System.out.println("Sorry, the correct answer is Juneau");
        }
        
        System.out.println("\nQ2) Can you store the value \"cat\" in a variable "
                + "type int?");
        System.out.println("\t1) Yes \n\t2) No");
         ans1=input.nextInt();
         
        if(ans1== 2){
            System.out.println("That's right");
            count++;
        }
        else{
            System.out.println("Sorry, the correct answer is No");
        }
        
        System.out.println("Q3) What is the result of 9+6/3? ");
        System.out.println("\t1) 5 \n\t2) 11 \n\t3) 15/3");
         ans1=input.nextInt();
         
           if(ans1== 2){
            System.out.println("That's right");
            count++;
        }
        else{
            System.out.println("Sorry, the correct answer is 11");
        }
         
        System.out.println("\nOverall, you got "+count+" out of 3 correct");
        System.out.println("Thanks for playing!");
    }
    
}
