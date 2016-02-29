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
public class AgeMessages3 {
    public static void main(String[] args) {
        String name="";
        int age=0;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Your name: ");
        name=input.nextLine();
        
        System.out.print("Your age: ");
        age=input.nextInt();
        
        if(age<16){
            System.out.println("You can't drive, "+name);
            System.exit(0);
        }
        if((age>=16)&&(age<=17)){
            System.out.println("You can drive but not vote,"+
                    name+" .");
            System.exit(0);
        }
        if((age>=18)&&(age<=24)){
            System.out.println("You can vote but not rent a car,"
            +name+" .");
            System.exit(0);
        }
        if(age>=25){
            System.out.println("You can do pretty much anthing, "
            +name+" .");
            System.exit(0);
        }
    }
    
}
