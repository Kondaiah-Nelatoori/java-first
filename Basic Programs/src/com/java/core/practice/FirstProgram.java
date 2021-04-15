package com.java.core.practice;

import java.util.Scanner;

//import jdk.internal.org.jline.terminal.Size;

public class FirstProgram {

	public FirstProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Srujana Where r u");
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum number of gates:");
        
        int ng = scan.nextInt();
       System.out.println(ng);
        
        int array[] = new int[ng];
        System.out.println("Size of Array: "+array.length);
        
        for(int i=0;i<array.length;i++) {
        	array[i]=i+1;
        }
        
       System.out.println("array[0] value: "+array[0]);
        for(int i=0;i<array.length;i++) {
        	System.out.print(array[i]);
        }
		
		/*int num = 0;
		char test =(char) num;
		float d = num;;
		int n=(int) d;
		
		System.out.println(num%2);*/
        
	}

}
