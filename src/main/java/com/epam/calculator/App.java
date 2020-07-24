package com.epam.calculator;

/**
 * Hello world!
 *
 
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the values :");
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	System.out.println("Enter the operator");

    	char c=sc.next().charAt(0);
    	
    	if(c=='+') {
    		Addition add=new Addition();
    		System.out.println("Addition of two numbers is :"+add.answer(x,y));
    	}
    	else if(c=='-') {
    		Subtraction sub=new Subtraction();
    		System.out.println("Subtraction of two numbers is :"+sub.answer(x,y));
    	}
    	else if(c=='*') {
    		Multiplication mul=new Multiplication();
    		System.out.println("Multiplication of two numbers is :"+mul.answer(x,y));
    	}
    	else if(c=='/'){
    		Division div=new Division();
    	    if(div.answer(x,y)==0) {
    	    	System.out.println("Division By zero Exception");
    	    }
    	    else {
        System.out.println( "Division of two numbers is :"+div.answer(x,y) );
    }
    	    }
}}
