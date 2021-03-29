package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}

	/*
	 * this(현재객체,현재클래스)
	 * 같은 클래스 내에 있는 코드
	 */
	public void makeScore() {
		System.out.println("국어점수입력");
		/*
		 * 메서드 return type이 보이드가 아닌 경우에는
		 * 메서드가 리턴한 값을 변수에 저장(받기)할 수 있다
		 * 이때 변수는 메서드의 return type과 같은 type(형)이어야 한다
		 */
		Integer intKor = this.inputScore(); // void가 있는 메서드는 변수에 담을 수 없음
		
		System.out.println("영어점수입력");
		Integer intEng = this.inputScore();
		
		System.out.println("수학점수입력");
		Integer intMath = inputScore();
		
		System.out.println(LinesService.dLines(30));
		System.out.printf("국어점수 : %d\n", intKor);
		System.out.printf("영어점수 : %d\n", intEng);
		System.out.printf("수학점수 : %d\n", intMath);
		System.out.println(LinesService.dLines(30));
		
	}

	private Integer inputScore() {

		Integer score = 0;
		while (true) {
			System.out.println("점수를 입력하세요{0~100)");
			System.out.print(">> ");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0~100까지만 입력해주세요");
				continue;
			}
			break;
		}
		// score 변수에 저장된 값을 호출한 곳(makeScore())으로 되돌려 주어라
		return score;
	}
}
