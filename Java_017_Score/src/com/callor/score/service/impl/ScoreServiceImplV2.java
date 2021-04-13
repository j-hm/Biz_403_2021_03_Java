package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputScore() {
		
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum == null) {
			return;
		}
		String strNum = String.format("2021%03d", intNum);
		
		System.out.println(strNum + "의 이름을 입력해주세요");
		System.out.print(">> ");
		String strName = scan.nextLine();
		
		Integer kor = inService.inputValue("국어", 0, 100);
		Integer eng = inService.inputValue("영어", 0, 100);
		Integer math = inService.inputValue("수학", 0, 100);
		
	}

	
}
