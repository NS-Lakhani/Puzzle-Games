package com.games;

import java.util.Scanner;

public class RandomStringGenerator {

	public static void main(String[] args) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of String to generate : ");
		int len = sc.nextInt();
		sc.close();
		String generatedString = "";
		
		for (int i=0; i<len; i++)
		{
			generatedString += chars.charAt((int)Math.floor(Math.random() * chars.length()));
		}
		
		System.out.println(generatedString);
	}

}
