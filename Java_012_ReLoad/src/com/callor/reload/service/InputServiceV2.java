package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;

	// 클래스 영역에 선언된 변수는 "멤버변수"라고 하고
	// 멤버변수는 이 클래스에 어떤 메서드에서든지 자유롭게 접근하여
	// 저장, 읽기가 가능
	int num;

	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		// 메서드의 {}에 선언된 변수는 지역변수라고 한다
		// 지역변수는 {}를 벗어나면 변수가 소멸한다
		// {}이 서로 다르면 이름을 같아도 절대 접근 불가
		// 멤버변수에 같은 이름의 변수가 있는데
		// 지역변수에 같은 이름으로 또 선언하면
		// 멤버변수는 감춰져서 접근 불가
		String num;
	}

	public void inputNum() {
		while (true) {
			System.out.println("정수를 입력하세요(범위 : 50~150)");
			System.out.print("정수 >> ");
			int num = scan.nextInt();
			if (num > 50 && num < 150) {
				intList.add(num);
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}

		}

	}

}
