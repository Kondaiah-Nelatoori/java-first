package com.java.core.practice;

public class Indicus {

	public Indicus() {
		// TODO Auto-generated constructor stub
	}

	void mainFunction(int num[], int target) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println(i + " " + j);

				}
			}
		}

	}

	void pattern(int num) {
		for (int i = 1; i <= num; i++) {

//			int x = 0;
//			while (x != i) {
//				System.out.print(" ");
//
//				x++;
//			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Indicus call = new Indicus();
		// call.mainFunction(new int[] { 1, 3, 5, 8, 2 }, 7);
		call.pattern(4);
	}

}
