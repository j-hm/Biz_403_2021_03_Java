package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKors = new int[5];
	int[] intEngs = new int[intKors.length];
	int[] intMaths = new int[intKors.length];

	int[] intTotal = new int[intKors.length];
	float[] floatAvg = new float[intKors.length];

	Scanner scan = new Scanner(System.in);
	int lineLength = 47;

	public void makeScore() {

		System.out.println("학생의 국어 점수를 입력해주세요");
		System.out.println();
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intKors[i] = scan.nextInt();
		}

		System.out.println(LinesService.dLines(lineLength));
		System.out.println("학생의 영어 점수를 입력해주세요");
		System.out.println();
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intEngs[i] = scan.nextInt();
		}

		System.out.println(LinesService.dLines(lineLength));
		System.out.println("학생의 수학 점수를 입력해주세요");
		System.out.println();
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intMaths[i] = scan.nextInt();
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

	public void printList() {

		System.out.println(LinesService.dLines(lineLength));
		System.out.println("\t\t세라여고 성적표");
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.sLines(lineLength));

		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("%3d\t", (i + 1));
			System.out.printf("%3d\t", intKors[i]);
			System.out.printf("%3d\t", intEngs[i]);
			System.out.printf("%3d\t", intMaths[i]);

			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\t\n", floatAvg[i]);
		}

		System.out.println(LinesService.dLines(lineLength));
	}
}
