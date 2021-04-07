package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	InputServiceV2 inService;

	public ScoreServiceV5() {
		subject = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		inService = new InputServiceV2();
	}

	public void inputScore() {
//		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.printf("학생 %d의 성적을 입력하세요\n", i+1);
//			int kor = inService.inputValue(subject[0], 0, 100);
//			int eng = inService.inputValue(subject[1], 0, 100);
//			int math = inService.inputValue(subject[2], 0, 100);
//			kors.add(kor);
//			engs.add(eng);
//			maths.add(math);
//			System.out.printf("[%d, %d, %d]\n", kor, eng, math);
//		}
		int[] scores = new int[5];
		
		for (int i = 0; i < subject.length; i++) {
			for(int j = 0 ; j < scores.length; j++) {
				System.out.printf("학생 %d번의\n", j+1);
				scores[i] = inService.inputValue(subject[i], 0, 100);
				}
				kors.add(scores[0]);
				engs.add(scores[1]);
				maths.add(scores[2]);
			}
			
	}
	
	public void printScore() {
		
	}
	
	

}
