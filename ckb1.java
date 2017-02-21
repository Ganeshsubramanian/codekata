/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekata;

import java.util.Scanner;

/**
 *
 * @author GKR
 */
public class pnz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Given number is Negative");
        }
        else if(n>0)
        {
        System.out.println("Given number is Positive");
        }
        else
        {
        System.out.println("Given number is Zero");
        }
    }
    
}
