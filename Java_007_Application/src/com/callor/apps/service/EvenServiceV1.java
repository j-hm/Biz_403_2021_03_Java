package com.callor.apps.service;

import java.util.Random;

//클래스 선언문(시작하는 곳)
public class EvenServiceV1 {

	int[] intNum;
	/*
	 * 생성자 메서드
	 *  : 클래스를 선언하면 자동으로 만들어지는 메서드
	 *    별도의 코드가 필요업으면 만들지 않아도 된다
	 * 생성자 메서드에는 클래스 영역의 변수들을 초기화 생성하기 위한
	 * 코드들이 작성된다
	 */
	public EvenServiceV1() {
		intNum = new int[100]; // 생성은 생성자에서
	}

	public void makeNum() {
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
	}

	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	public void printNum() {
		int intSum = 0;
		System.out.println("===========================");
		System.out.println("짝수 리스트");
		System.out.println("---------------------------");
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				intSum += intNum[i];
			}
		}
		System.out.println("===========================");
		System.out.printf("짝수의 합 : %d\n", intSum);
	}

}
