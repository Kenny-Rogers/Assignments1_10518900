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
public class TwentyQuestions {
    public static void main(String[] args) {
        String que1;
        String que2;
        String ans="";
        Scanner input=new Scanner(System.in);
        
        System.out.println("TWO QUESTIONS!\nThink of an object"
                + ", and I'll try to guess it.");
        System.out.println("\nQuestions 1) Is it animal, vegetable "
                + "or mineral?");
       que1=input.nextLine();
        System.out.println("\nQuestin 2) Is it bigger than a beadbox?");
        que2=input.nextLine();
        
        if(que1.equals("animal")){
            if(que2.equals("yes")){
                ans="noose";
            }
            else if(que2.equals("no")){
                ans="squirrel";
            }
        }
        else if (que1.equals("vegetable")){
             if(que2.equals("yes")){
                ans="watermelon";
            }
            else if(que2.equals("no")){
                ans="carrot";
            }
        }
        else if(que1.equals("mineral")){
             if(que2.equals("yes")){
                ans="camaro";
            }
            else if(que2.equals("no")){
                ans="paper clip";
            }
        }else{
            System.out.println("UnKnown input");
            System.exit(0);
        }
        
        System.out.println("\nMy guess is that you are thinking "
                + "of a "+ans+".");
        System.out.println("I would ask you if I'm right, but "
                + "I don't actually care.");
    }
}