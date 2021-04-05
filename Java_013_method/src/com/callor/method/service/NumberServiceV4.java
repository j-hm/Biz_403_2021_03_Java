package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0 ~ 100범위의 정수를 입력하세요");
			System.out.println("QUIT : 입력취소");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum = null;
			if (strInput.equals("QUIT")) {
				return null;
			} else {
				try {
					// 1. 입력된 값이 QUIT가 아니면 일단 정수로 바꿔보기
					intNum = Integer.valueOf(strInput);

				} catch (NumberFormatException e) {
					System.out.println("숫자가 아닌 값입니다");
					// 다시 입력하는 곳으로 돌아가라
					continue;
				}
			} // end if "QUIT"
			
			// 2. 정수이면 0~100까지 인지 알아보자
			if (intNum < 0 || intNum > 100) {
				System.out.println("범위 밖의 값입니다");
				// 다시 입력하는 곳으로 돌아가라
				continue;
			}
			return intNum;
		}
	} // end inputNum()
}
