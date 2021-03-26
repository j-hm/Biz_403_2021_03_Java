package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(50));
		System.out.println("정수를 입력하세요");
		System.out.print(">> ");
		int num = scan.nextInt();
		System.out.println(LinesService.dLines(50));

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다\n", num);
		} else {
			System.out.printf("%d는 짝수가 아닙니다\n", num);
		}

		// 소수 판별을 하는 2 ~ (자신 - 1)수로 나누었을 때
		// 나머지가 0인 경우가 한 번도 없어야 한다
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}

		if (i < num) {
			System.out.printf("%d는 소수가 아닙니다\n", num);
		} else {
			System.out.printf("%d는 소수입니다\n", num);
		}

		System.out.println(LinesService.dLines(50));
	}

}
