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
public class TwoMoreQuestions {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     String ans1="";
     String ans2="";
        
     System.out.print("Questions 1:Does it belong inside or outside or both? ");
     ans1=input.nextLine();
     System.out.print("Question 2: Is it alive?");
     ans2=input.nextLine();
    
     if(ans1.equals("inside")&&ans2.equals("yes")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a houseplant");
         System.exit(0);
     }
    if(ans1.equals("outside")&&ans2.equals("yes")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a bison");
         System.exit(0);
     }
     if(ans1.equals("both")&&ans2.equals("yes")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a dog");
         System.exit(0);
     }
       if(ans1.equals("inside")&&ans2.equals("no")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a shower curtain");
         System.exit(0);
     }
         if(ans1.equals("outside")&&ans2.equals("no")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a billboard");
         System.exit(0);
     }
           if(ans1.equals("both")&&ans2.equals("no")){
         System.out.println("\n Then what else could be thinking "
                 + "of besides a cell phone");
         System.exit(0);
     }
    }
}
