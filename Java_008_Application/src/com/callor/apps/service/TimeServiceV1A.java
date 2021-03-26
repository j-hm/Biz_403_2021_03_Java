package com.callor.apps.service;

public class TimeServiceV1A {

	int[] intNums;

	public TimeServiceV1A() {
		intNums = new int[8];
	}

	public void makeNum() {

		/*
		 * 배열은 총 8개
		 * 배열에 저장할 값은 2 ~ ??
		 */
		for (int i = 0; i < intNums.length; i++) {
			int num = i + 2;
			intNums[i] = num;
		}
	}

	/*
	 * 배열에 담긴 앖 (2 ~ ??) = 단에 해당하는 값
	 */
	public void printTime() {

		for (int i = 0; i < intNums.length; i++) {
			
			// 메서드에 리턴 ?? 명령문이 있으면
			// 변수 = 메서드() 형식으로 코드를 작성하고
			// 메서드가 리턴해준 결과값을 변수에 저장할 수 있다
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			
			System.out.println(dLines);
			System.out.printf("%d단 구구단\n", intNums[i]);
			System.out.println(sLines);

			for (int j = 0; j < intNums.length; j++) {
				int num = j + 2;
				System.out.printf("%d x %d = %d\n", intNums[i], num, intNums[i] * num);
			}

			System.out.println(dLines);
		}

	}

}
