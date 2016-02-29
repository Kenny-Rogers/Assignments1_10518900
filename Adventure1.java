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
public class Adventure1 {
    public static void main(String[] args) {
        int ans=0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("\t\tWELCOME TO ADVENTURE HOUSE!");
        System.out.println("You are in the house now. PRESS"
                + "\n\t1)To go to SITTING ROOM \t2)To go to Corridor");
        ans=input.nextInt();
        if(ans==1){
            System.out.println("You are in the SITTING ROOM now."
                    + " PRESS \n\t1)To go to DINNING HALL"
                    + "\t2)To go to Kitchen");
               ans=input.nextInt();
               if(ans==1){
                        System.out.println("You are in the DINING HALL now."
                         + " PRESS \n\t1)To TAKE A DRINK "
                         + "\t2)To HAVE A SIT");
                         ans=input.nextInt();
                         if(ans==1){
                                  System.out.println("Enjoy your drink!");
                         }else if(ans==2){
                                  System.out.println("Food will be served soon!");
                         }else{
                                  System.out.println("Wrong input!");
                                  System.exit(0);
                          }
                }else if(ans==2){
                        System.out.println("You are in the KITCHEN now."
                        + " PRESS \n\t1)To assist in cooking"
                        + "\t2)To just watch people cook");
                        ans=input.nextInt();
                        if(ans==1){
                                 System.out.println("Thanks for your assistance!");
                        }else if(ans==2){
                                 System.out.println("You are lazy!");
                        }else{
                                 System.out.println("Wrong input!");
                                 System.exit(0);
                         }
                }else{
                                 System.out.println("Wrong input!");
                                 System.exit(0);
                         }
        }else if(ans==2){
            System.out.println("You are in the CORRIDOR now."
                    + " PRESS \n\t1)To go to WASH ROOM"
                    + "\t2)To go to MASTER BEDROOM");
                ans=input.nextInt();
                if(ans==1){
                   System.out.println("You are in the WASH ROOM now."
                    + " PRESS \n\t1)To TAKE YOUR BATH"
                    + "\t2)To SCRAB THE BATH");
                        ans=input.nextInt();
                        if(ans==1){
                            System.out.println("Do not wet the place!");
                        }else if(ans==2){
                           System.out.println("Hardwork does brake bones");
                        }else{
                                System.out.println("Wrong input!");
                                System.exit(0);
                        }
                }else if(ans==2){
                   System.out.println("You are in the MASTER BEDROOM now."
                    + " PRESS \n\t1)To SLEEP "
                    + "\t2)To WATCH T.V");
                    ans=input.nextInt();
                    if(ans==1){
                            System.out.println("Sound Sleep!");
                    }else if(ans==2){
                             System.out.println("Reduce the volume!");
                    }else{
                             System.out.println("Wrong input!");
                             System.exit(0);
                     }
               }else{
                        System.out.println("Wrong input!");
                        System.exit(0);
                }
        }else{
            System.out.println("Wrong input!");
            System.exit(0);
        }
    }
    
}
