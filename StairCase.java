package com.cubictraining.homework.demo;
 import java.util.Scanner;
public class StairCase {

	public static void main(String[] args) {

//Scanner st= new Scanner(System.in);
	  //int n=st.nextInt();
	  int n=7;
	  for(int i=1;i<=n;i++)
	  {
	   for(int b=n;b>=i;b--)
	    
	   {
	  
	      System.out.print(" ");
	    }

	   for(int k =1;k<=i;k++)
	   {
		   System.out.print("#");
	   }
	   System.out.println();
	}
	}}


