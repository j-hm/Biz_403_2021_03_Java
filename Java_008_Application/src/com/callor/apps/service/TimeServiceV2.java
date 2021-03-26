package com.callor.apps.service;

public class TimeServiceV2 {

	int[] intNums;

	public TimeServiceV2() {
		intNums = new int[8];
	}

	public void makeNum() {

		for (int i = 0; i < intNums.length; i++) {
			int num = i + 2;
			intNums[i] = num;
		}
	}

	public void printTime() {

		for (int i = 0; i < intNums.length; i++) {
			
			//선언한하고 바로 넣어도 상관無
			System.out.println(LinesService.dLines(50));
			System.out.printf("%d단 구구단\n", intNums[i]);
			System.out.println(LinesService.sLines(50));

			for (int j = 0; j < intNums.length; j++) {
				int num = j + 2;
				System.out.printf("%d x %d = %d\n", intNums[i], num, intNums[i] * num);
			}

			System.out.println(LinesService.dLines(50));
		}

	}

}
