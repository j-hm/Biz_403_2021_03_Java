package com.callor.apps;

import java.util.Random;

public class App_04 {
	public static void main(String[] args) {
		int[] intClass = new int[5];
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			intClass[i] = rnd.nextInt(10) + 50;
		}
		
		int pizzaPcs = 6;
		int pizzaBox = 0; 
		
		for (int i = 0; i < 5; i++) {
			boolean bYes = intClass[i] % pizzaPcs == 0;
			if(!bYes) {
				++pizzaBox;
			}
		}
		System.out.println("인원수\t피자\t전체");
		System.out.println();
		
	}

}
