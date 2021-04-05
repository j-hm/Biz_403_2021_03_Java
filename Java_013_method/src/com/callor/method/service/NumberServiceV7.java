package com.callor.method.service;

public class NumberServiceV7 {

	String[] sub = { "국어", "영어", "수학", "과학", "국사" };

	public Integer inputScore() {
		InputService inService = new InputService();
		for (int i = 0; i < sub.length; i++) {
			while (true) {
				Integer retNum = inService.inputValue(sub[i]);
				if (retNum == null) {
					System.out.println("시스템을 종료합니다");
					// 끝
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("0~100이내의 값 입력");
					// 되돌아가기
				}
				//성적 배열 만들어서 값 저장하기
			}

		}

		return null;
	}

}
