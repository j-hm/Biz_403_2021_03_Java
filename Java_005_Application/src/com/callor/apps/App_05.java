package com.callor.apps;

import java.util.Random;

public class App_05 {
	public static void main(String[] args) {
		
		int[] members = new int[5];
		Random rnd = new Random();
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float floatAvg = 0;
		
		
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		
		for(int i = 0; i < 5; i++) {
			
			intKor = rnd.nextInt(51) + 50;
			intEng = rnd.nextInt(51) + 50;
			intMath = rnd.nextInt(51) + 50;
			intSum = (intKor + intEng + intMath);
			floatAvg = (float) intSum / 3; 
			System.out.printf("%2d\t", (i+1));
			System.out.printf("%d\t %d\t %d\t", intKor, intEng, intMath);
			System.out.printf("%3d\t%3.2f\t\n", intSum , floatAvg);
		}
		System.out.println("==============================================");
	}

}
