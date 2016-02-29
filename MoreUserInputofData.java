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
public class MoreUserInputofData {
    
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String fNme= "";
        String lNme="";
        int gde=0;
        int id=0;
        String lgn="";
        double gpa=0.0;
        
        System.out.println("Please enter the following information so I can"
                          +" sell it for a profit");
        
        System.out.print("First name: ");
        fNme=keyboard.nextLine();
        
        System.out.print("Last name: ");
        lNme=keyboard.nextLine();
        
        System.out.print("Grade (9-12): ");
        gde=keyboard.nextInt();
        
        System.out.print("Student ID: ");
        id=keyboard.nextInt();
        
        System.out.print("Login: ");
        lgn=keyboard.next();
        
        System.out.print("GPA (0.0-4.0): ");
        gpa=keyboard.nextDouble();
        
        System.out.println("Your information: ");
        System.out.println("\tLogin: "+ lgn);
        System.out.println("\tID: "+ id);
        System.out.println("\tName: "+ lNme+" , "+fNme);
        System.out.println("\tGPA: "+ gpa);
        System.out.println("\tGrade: "+ gde);
    }
}
