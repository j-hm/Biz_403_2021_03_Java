package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.jhm.standard.InputService;
import com.jhm.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected String[] subject;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("성적 입력 및 리스트 출력");
			System.out.println("-".repeat(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("QUIT. 입력취소");
			System.out.println("=".repeat(50));
			System.out.print(">> ");
			String menuIn = scan.nextLine();
			if (menuIn.equals("QUIT")) {
				break;
			}
			try {
				Integer intNum = Integer.valueOf(menuIn);
				if (intNum == 1) {
					this.inputScore();
				} else if (intNum == 2) {
					this.printScore();
				} else {
					System.out.println("!입력오류!");
					System.out.println("올바른 메뉴를 선택해주세요");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("!입력오류!");
				System.out.println("1, 2, 3과 QUIT만 입력가능");
				continue;
			}
		}

	}

	@Override
	public String inputName(String title) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < 5; i++) {
//			System.out.println("학번을 입력하세요");
//			System.out.print(">> ");
//			String num = scan.nextLine();

		System.out.println(title + "을 입력하세요");
		System.out.print(">> ");
		String strIn = scan.nextLine();
		return strIn;
//		}

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

		InputService inService = new InputServiceImplV1();

//		for (int i = 0; i < 5; i++) {
//			ScoreVO scoreVO = scoreList.get(0);
//			System.out.printf("[%s번 %s의 성적입력]\n", scoreVO.getNum(),scoreVO.getName());
		System.out.println("=".repeat(50));
		String num = this.inputName("학번"); // 문자열 입력하면 다시 입력하게
		String name = this.inputName("이름");
		System.out.println(name + "의 성적을 입력해주세요");
		Integer[] score = new Integer[subject.length];

		for (int sb = 0; sb < subject.length; sb++) {
			score[sb] = inService.inputValue(subject[sb], 0, 100);
			if (score[sb] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(score[0]);
		scoreVO.setEng(score[1]);
		scoreVO.setMath(score[2]);
		scoreVO.setName(name);
		scoreVO.setNum(num);

		scoreList.add(scoreVO);
//		}
		System.out.println(scoreList.toString());

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학");
		System.out.println("-".repeat(50));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");

		}
	}

}
