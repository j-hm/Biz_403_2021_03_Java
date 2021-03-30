package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {
	public static void main(String[] args) {

		/*
		 * 제네릭 Generic 사용 : <Integer>
		 * List 형 객체에 저장할 데이터의 타입을 제한하므로써
		 * 코드의 실행과 메모리 사용에 효율을 높이기 위함이다
		 */
		List<Integer> divisor = new ArrayList<Integer>();
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;

		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				divisor.add(i);
			}
		}
		System.out.println("생성된 난수 : " + intNum);
		System.out.println("약수들의 리스트 : ");
		for (int i = 0; i < divisor.size(); i++) {
			System.out.print(divisor.get(i) + "\t");
		}
	}

}
