package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class Class_02 {
	public static void main(String[] args) {
		
		/*
		 * Java에서 제공되는
		 * 매우 사용이 편리한 배열자료구조
		 * 1. 몇개의 데이터를 저장할지 미리 정하지 않아도 된다.
		 * 2. 필요에 따라서 개수를 늘리거나 줄일 수 있다.
		 * 3. 매우 다양한 여러가지 기능이 이미 준비되어 있다.
		 * 
		 * Integer형(type)의 데이터를 다수 저장할(리스트형 데이터) intList 객체를 선언
		 * Integer[] intList = new Integer[??];
		 * 
		 * List클래스를 사용하여 intList 객체를 선언한다
		 * 단, intList에는 Integer형 데이터만 저장할 수 있다
		 * 
		 * <Integer> : 제네릭Generic 선언
		 * =>저장될 데이터의 차입을 규정하는 방법
		 * =>Primitive(기본형)은 포함할 수 없다, 반드시 wrapper class형만 포함할 수 있다
		 * 
		 * List형 객체 : 리스트 클래스를 사용한 객체
		 * =>선언을 할 때는 List를 사용하고 생성(초기화)할 때는 ArrayList()생성자를 사용
		 * 
		 * List형 객체를 선언하고 ArrayLis()t로 생성을 하면
		 * 사이즈size가 0인 배열객체가 생성되는 것과 유사
		 * 		 
		 */
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		// 그 외에 롱 더블 불린 플로트 캐릭터도 꺽쇠안에 넣어 사용가능
		// 기본형(int) 사용불가 클래스(Integer)만 사용가능
		
		
		//배열의 값을 저장할 때는 원하는 length크기만큼 배열을 선언 생성하고
		//첨자를 사용하여 위치를 지정한 후 값을 저장
		int[] nums = new int[5];
		nums[0] = 100;
		
		//List형 객체에 데이터를 저장할 때는 "추가"하여 저장
		//List형 객체에 데이터를 추가할 때는
		// .add() method사용한다
		
		//intList의 size가 1이 되고
		//자동으로 0번 위치에 100이 저장
		intList.add(100); // [0]
		intList.add(200); // [1]
		intList.add(300); // [2]
		
		//intList의 [0]번 위치에 저장된 값을 읽고 싶다
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		//값을 읽을 때 저장된 데이터 개수의 index범위를 벗어날 수 없다
		//위에서 add() 3번 실행되었기 때문에
		//==>사이즈는 3이되고
		//==>get(index)를 수행할 때 index값을 사이즈 -1까지만 사용할 수 있다
		//System.out.println(intList.get(3));
	}

}
