package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[5];

		System.out.println(LinesService.dLines(30));
		System.out.println("[정수 5개의 합 구하기]");
		System.out.println(LinesService.dLines(30));
		System.out.println("정수 5개를 입력 후 Enter :) ");
		System.out.println(LinesService.sLines(30));

		for (int i = 0; i < intNums.length; i++) {
			int num = i + 1;
			System.out.printf("정수 %d >>", num);
			intNums[i] = scan.nextInt();
		}

		System.out.println(LinesService.dLines(30));
		System.out.print("입력한 정수 : ");
		System.out.println(Arrays.toString(intNums));
		System.out.println(LinesService.sLines(30));

		int intSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			intSum += intNums[i];
		}
		System.out.println("입력된 정수의 합 : " + intSum);
		System.out.println(LinesService.dLines(30));

	}

}
