package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKors = new int[5];
	int[] intEngs = new int[intKors.length];
	int[] intMaths = new int[intKors.length];

	int[] intTotal = new int[intKors.length];
	float[] floatAvg = new float[intKors.length];

	Scanner scan = new Scanner(System.in);
	int num = 100;

	public void makeScore() {

		System.out.println(LinesService.dLines(50));
		
		for (int i = 0; i < intKors.length; i++) {

			System.out.printf("%d번 학생의 성적을 입력하세요\n", i + 1);

			while (true) {
				System.out.print("국어 >> ");
				intKors[i] = scan.nextInt();

				if (intKors[i] > num) {
					System.out.println("  !!범위의 점수가 아님!!");
					System.out.println("1 ~ 100까지의 점수를 입력해주세요");
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("영어 >> ");
				intEngs[i] = scan.nextInt();

				if (intEngs[i] > num) {
					System.out.println("  !!범위의 점수가 아님!!");
					System.out.println("1 ~ 100까지의 점수를 입력해주세요");
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("수학 >> ");
				intMaths[i] = scan.nextInt();

				if (intMaths[i] > num) {
					System.out.println("  !!범위의 점수가 아님!!");
					System.out.println("1 ~ 100까지의 점수를 입력해주세요");
				} else {
					break;
				}
			}

			System.out.println(LinesService.dLines(50));

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

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.dLines(50));
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", intKors[i]);
			System.out.printf("%3d\t", intEngs[i]);
			System.out.printf("%3d\t", intMaths[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println(LinesService.dLines(50));
	}

}
