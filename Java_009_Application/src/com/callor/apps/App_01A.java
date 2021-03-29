package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1A;

public class App_01A {

	public static void main(String[] args) {

		// ScoreServiceV1A클래스를 사용하여 객체를 생성할 때
		// 정수 5를 전달해주고 5만큼의 배열을 생성하도록 코드 변경
		ScoreServiceV1A ssV1 = new ScoreServiceV1A(5);
		/*
		 * 메서드를 호출하여 명령 실행하기
		 * 
		 * ssV1.makeScore()명령을 한 줄 실행하므로써
		 * ScoreServiceV1A  클래스에 정의되어 있는 "어떤 코드"가 실행되는 효과를 만들어낸다
		 */
		ssV1.makeScore();

		ssV1.addNum();
		/*
		 * inputScore() 메서드는 private으로 선언되어 있기 때문에 객체.inputScore 형식으로 사용할 수 없다
		 */
		// ssV1.inputScore();
	}
}
