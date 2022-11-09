package com.bridgelabz.Day6;

import java.util.Scanner;

public class CouponNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of coupan required to generate");
		int numberofCup = sc.nextInt();
		int[] array = new int[numberofCup];
		for (int i = 0; i < numberofCup; i++) {
			int randomCheck = (int) (Math.floor(Math.random() * 100) % 100) + 1;
			for (int k = 0; k <= i; k++) {
				if (array[k] != randomCheck)
					array[i] = randomCheck;

			}
			for (int j = 0; j < numberofCup; j++)
				System.out.println(array[j] + "");

		}
	}

}
