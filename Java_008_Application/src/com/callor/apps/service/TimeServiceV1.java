package com.callor.apps.service;

public class TimeServiceV1 {

	int[] intNums;

	public TimeServiceV1() {
		intNums = new int[8];
	}

	public void makeNum() {

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}

	public void printTime() {

		for (int i = 0; i < intNums.length; i++) {
			System.out.println("=============================");
			System.out.printf("%d단 구구단\n", intNums[i]);
			System.out.println("=============================");

			for (int j = 0; j < intNums.length; j++) {
				int num = j + 2;
				System.out.printf("%d x %d = %d\n", intNums[i], num, intNums[i] * num);

			}

			System.out.println("=============================");
		}

	}

}
