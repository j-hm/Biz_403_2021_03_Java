package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] intNums = new int[5];
		int intSum = 0;
		
		System.out.println(LinesService.dLines(30));
		System.out.println("정수 5개를 입력해주세요 :)");
		System.out.println(LinesService.sLines(30));
		for(int i = 0; i < intNums.length; i++) {
			int num = i + 1;
			System.out.printf("정수 %d >>", num);
			intNums[i] = scan.nextInt();
			intSum += intNums[i];
		}
		System.out.println(LinesService.dLines(30));
		System.out.println("입력된 정수의 합 : " + intSum);
		System.out.println(LinesService.dLines(30));
		
	}
	
}
