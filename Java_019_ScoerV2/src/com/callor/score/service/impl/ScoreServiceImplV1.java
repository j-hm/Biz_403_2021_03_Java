package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.domain.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subject;
	protected Integer[] subScore;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] {"국어", "영어", "수학"};
		subScore = new Integer[subject.length];
	}

	@Override
	public void insertScore() {
		// TODO Auto-generated method stub
		ScoreVO vo = new ScoreVO();

		while(true) {
			System.out.println("학번을 입력하세요");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			try {
				Integer intNum = Integer.valueOf(strNum);
				strNum = String.format("%05d", intNum);
				vo.setNum(strNum);
			} catch (NumberFormatException e) {
				System.out.println("학번은 숫자만 입력해주세요");
				continue;
			}
			break;
		}
		
		for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + " 점수를 입력해주세요");
			System.out.print(">> ");
			subScore[i] = scan.nextInt();
		}

		vo.setKor(subScore[국어]);
		vo.setEng(subScore[영어]);
		vo.setMath(subScore[수학]);
		scoreList.add(vo);
		System.out.println(vo);
		
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}


	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
