package com.callor.apps;

import java.util.Random;

/*
 * 5명 학생의 국영수 점수 총점과 평균이 기재된 성적표 만들기
 * 배열 과목을 학생수만큼 만들기
 */
public class App_05A {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		//과목 3가지를 학생수만큼 배열을 선언
		int[] intKors = new int[5];
		int[] intEngs = new int[5];
		int[] intMaths = new int[5];
		
		//가상의 점수 생성하기
		for(int i =0 ; i<5;i++) {
			intKors[i] = rnd.nextInt(51)+50;
			intEngs[i] = rnd.nextInt(51)+50;
			intMaths[i] = rnd.nextInt(51)+50;
		}
		
		//학생별로 총점과 평균을 계산하여 저장해두기
		int[] intTotal = new int[5];
		float[] floatAvg = new float[5];
		
		for(int i =0 ; i<5;i++) {
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];
			floatAvg[i] = (float) intTotal[i] / 3; 
		}
		
		int intALLTotal =0;
		
		//리스트 출력하기
		System.out.println("===========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i =0 ; i<5;i++) {
			
			System.out.print((i+1) + "\t");
			System.out.print(intKors[i] + "\t");
			System.out.print(intEngs[i] + "\t");
			System.out.print(intMaths[i] + "\t");
			
			System.out.print(intTotal[i] + "\t");
			System.out.printf("%2.2f\n", floatAvg[i]);
			
			intALLTotal += intTotal[i];
		}
	
		System.out.println("===========================");
		System.out.printf("총점 합 : \t\t\t%d", intALLTotal);
	}

}
