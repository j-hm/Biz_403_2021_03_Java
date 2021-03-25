package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {

	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int[] intTotal;
	float[] floatAvg;

	public ScoreServiceV1() {

		intKors = new int[10];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intTotal = new int[intKors.length];
		floatAvg = new float[intKors.length];
	}

	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < intKors.length; i++) {
			intKors[i] = rnd.nextInt(100) + 1;
			intEngs[i] = rnd.nextInt(100) + 1;
			intMaths[i] = rnd.nextInt(100) + 1;
		}
	}

	
	public void makeSum() {
		for (int i = 0; i < intKors.length; i++) {
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];

			floatAvg[i] = (float) intTotal[i] / 3;
		}
	}

	
	public void printScore() {
		System.out.println("=====================================");
		System.out.println("\t세라여고 성적리스트");
		System.out.println("-------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("%3d\t%3d\t%3d\t", intKors[i], intEngs[i], intMaths[i]);
			System.out.printf("%3d\t%3.2f\t\n", intTotal[i], floatAvg[i]);
		}
		System.out.println("=====================================");
	}

}
