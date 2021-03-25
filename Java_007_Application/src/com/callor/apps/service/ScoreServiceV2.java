package com.callor.apps.service;

public class ScoreServiceV2 extends ScoreServiceV1 {

	// for(int i = 0)
	// int members = 5
	// 메서드() 괄호 안에 선언된 변수
	// 매개 변수, parameter
	public ScoreServiceV2(int members) {

		intKors = new int[members];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intTotal = new int[intKors.length];
		floatAvg = new float[intKors.length];
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
