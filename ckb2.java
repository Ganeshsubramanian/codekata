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
public class oddeven {
    public static void main(String[] args){
    int n;
    System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("number is even");

        }
        else if(n%2!=0)
        {
            System.out.println("number is odd");

        }
        else{
            System.out.println("Invalid number");

        }
    
    }
}
