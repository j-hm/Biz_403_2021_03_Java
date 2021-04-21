package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}
		System.out.println(intList.toString());

		List<Integer> valList = new ArrayList<Integer>();
		valList.add(30);
		valList.add(40);
		valList.add(50);
		valList.add(60);
		valList.add(70);
		intList.removeAll(valList);
		intList.removeAll(valList);
		System.out.println(intList.toString());
		
		intList.add(999); // 맨 끝에 추가하기
		intList.add(3, 9999); // 3번 위치에 값 추가하기 ( 0 ~ )
		System.out.println(intList.toString());
		intList.set(6, 7777); // 6번 위치의 값 변경하기
		System.out.println(intList.toString());

		while (true) {
			if (intList.size() < 1)
				break;
			int index = rnd.nextInt(intList.size());
			System.out.print(intList.get(index) + "\t");
			intList.remove(index);
		}
	}
}
