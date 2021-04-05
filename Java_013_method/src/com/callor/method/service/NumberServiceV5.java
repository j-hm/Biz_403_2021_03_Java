package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(title + "의 값을 입력하세요");
			System.out.println("0 ~ 100범위의 정수를 입력하세요");
			System.out.println("QUIT : 입력취소");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum = null;
			if (strInput.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strInput);

				} catch (NumberFormatException e) {
					System.out.println("숫자가 아닌 값입니다");
					continue;
				}
			}
			if (intNum < 0 ) {
				System.out.println("범위 밖의 값입니다");
				// 다시 입력하는 곳으로 돌아가라
				continue;
			}
			return intNum;
		}

	}

}
