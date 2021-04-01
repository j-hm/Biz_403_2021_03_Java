package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		System.out.println("정수 두 개를 입력하세요");
		System.out.println("두번쨰 정수는 첫번째보다 작은수 입력");

		Integer intNum1 = 0;
		Integer intNum2 = 0;

		while (true) {
			System.out.print("첫번째 >> ");
			String strNum1 = scan.nextLine();

			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("두번째 >> ");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			if (intNum1 < intNum2) {
				System.out.println(intNum1 + "보다 작은 값을 입력해주세요");
				continue;
			}
			break;
		}

		NumberVO vo = new NumberVO();
		vo.setNum1(intNum1);
		vo.setNum2(intNum2);
		numList.add(vo);
	}

	public void ptintNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = new NumberVO();
			System.out.print(vo.getNum1());
			System.out.print("-");
			System.out.print(vo.getNum2());
			System.out.print("=");
			System.out.println(vo.getNum1() - vo.getNum2());
		}
	}

}
