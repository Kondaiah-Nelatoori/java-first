package com.java.core.oops;

public class ConstractorDmeo {

	public ConstractorDmeo() { // Default Constactor
		// TODO Auto-generated constructor stub
		int i = 5;
		System.out.println("Hi " + i);
	}

	public ConstractorDmeo(int num, String word) {

		System.out.println("Parameterized Constructor ======");
		System.out.println(" Hello IT "+ word);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstractorDmeo();
		new ConstractorDmeo(420, "I am coming strong");
	}

}
