package com.games;

public class RandomStringGenerator {

	public static void main(String[] args) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		int len = 10;
		String generatedString = "";
		
		for (int i=0; i<len; i++)
		{
			generatedString += chars.charAt((int)Math.floor(Math.random() * chars.length()));
		}
		
		System.out.println(generatedString);
	}

}
