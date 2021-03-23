package com.callor.apps;

import java.util.Random;

public class App_04 {
	public static void main(String[] args) {
		int[] intClass = new int[5];
		Random rnd = new Random();
		int intTotal = 0;

		for (int i = 0; i < 5; i++) {
			intClass[i] = rnd.nextInt(10) + 50;
		}

		int pizzaPcs = 6;

		System.out.println("=====================");
		System.out.println("인원수\t피자\t전체");
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++) {
			boolean bYes = intClass[i] % pizzaPcs == 0;
			int pizzaBox = intClass[i] / pizzaPcs;
			if (!bYes) {
				++pizzaBox;
			}
			System.out.printf("%d\t %d\t %d\n"
							, intClass[i], pizzaBox, (pizzaBox * pizzaPcs));
			intTotal += pizzaBox;
		}
		System.out.println("---------------------");
		System.out.println("전체 피자 박스 : " + intTotal);

	}

}
