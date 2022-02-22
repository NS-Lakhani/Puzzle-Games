package com.games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		int r = random.nextInt(100) + 1;
		
		boolean correctGuess = false;
		
		while (!correctGuess)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int input = sc.nextInt();
			
			if (input > r)
				System.out.println("Too High.");
			else if (input < r)
				System.out.println("Too Low.");
			else
			{
				System.out.println("Woohooo!!! That's right.");
				correctGuess = true;
				sc.close();
			}
		}
	}
}
