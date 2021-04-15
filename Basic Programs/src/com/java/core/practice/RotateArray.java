package com.java.core.practice;

import java.util.Scanner;

public class RotateArray {

	public RotateArray() {
		// TODO Auto-generated constructor stub
	}
	
	void leftRotate(int array[], int shift) {
		int n= array.length;
		for (int i=0;i<shift;i++) {
			int temp= array[0];
			for(int j=0;j<n-1;j++) {
				array[j]= array[j+1];
				
				
				//System.out.println(array[j]);
			}
			array[n-1]=temp;
		
	}
		System.out.println("Left Shift");
		print(n, array);
	}
	
	void rightRotate(int array[],int shift) {
		int n= array.length;
		for (int i=0;i<shift;i++) {
			int temp= array[n];
			for(int j=n;j==0;j--) {
				array[j]= array[j-1];
				
				
				//System.out.println(array[j]);
			}
			array[0]=temp;
		
	}
		System.out.println("Right Shift");
		print(n, array);
		
	}
	
	void print(int n, int array[]) {
		for(int p=0;p<n;p++) 
			System.out.print(array[p]+" ,");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RotateArray rotate =new RotateArray();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int arraySize = scan.nextInt();
		System.out.print("How many time array should rotate :");
		int shift = scan.nextInt();
		int array[] = new int[arraySize];
		
		for(int index=0; index<arraySize;index++)
		{
			System.out.print("Enter the element "+index+" :");
			array[index] = scan.nextInt();
		}
		
		
	   rotate.leftRotate(array,shift);
	   
	   rotate.rightRotate(array, shift);
			
		}
		
		

	}
	
	


