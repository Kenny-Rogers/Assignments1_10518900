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
public class GenderGame {
    public static void main(String[] args) {
        String fname, lname;
        String gder, mrst;
        int age;
        Scanner input=new Scanner(System.in);
        
        System.out.print("What is your gender (M or F): ");
        gder=input.nextLine();
        System.out.print("First name: ");
        fname=input.nextLine();
        System.out.print("Last name:");
        lname=input.nextLine();
        System.out.print("Age:");
        age=input.nextInt();
        if(gder.equals("F") && (age>=20)){
        System.out.println("\nAre you married, "+fname+" (y or n)");
        mrst=input.nextLine();
            if(mrst.equals("y")){
                System.out.println("Then i shall call you Mrs. "
                        + lname+".");
            }
            if(mrst.equals("n")){
                System.out.println("Then i shall call you Mrs. "
                        + lname+".");
            }
        }else if(gder.equals("F")&&(age<20)){
            System.out.println("Then i shall call you "+fname
                    +" "+lname+".");
        }
        else if(gder.equals("M") && (age>=20)){
        System.out.println("\nAre you married, "+fname+" (y or n)");
        mrst=input.nextLine();
            if(mrst.equals("y")){
                System.out.println("Then i shall call you Mr. "
                        + lname+".");
            }
            if(mrst.equals("n")){
                System.out.println("Then i shall call you Mr. "
                        + lname+".");
            }
        }else if(gder.equals("F")&&(age<20)){
            System.out.println("Then i shall call you "+fname
                    +" "+lname+".");
        }
        
        
    }
    
}
