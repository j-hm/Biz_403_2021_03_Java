package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		Integer intNum1 = 0;
		Integer intNum2 = 0;
		System.out.println("정수 두 개를 입력하세요");
		System.out.print(">> ");
		String strNum1 = scan.nextLine();
		try {
			intNum1 = Integer.valueOf(strNum1);
		} catch (Exception e) {
			System.out.println("!정수만 입력해주세요!");
		}

		System.out.print(">> ");
		String strNum2 = scan.nextLine();
		try {
			intNum2 = Integer.valueOf(strNum2);
		} catch (Exception e) {
			System.out.println("!정수만 입력해주세요!");
		}

		NumberVO vo = new NumberVO();
		vo.setNum1(intNum1);
		vo.setNum2(intNum2);

		numList.add(vo);

		System.out.println("정수리스트");
		System.out.println("=".repeat(10));
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());
		}
	}

}
