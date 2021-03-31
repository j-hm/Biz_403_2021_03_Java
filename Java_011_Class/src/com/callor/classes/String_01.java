package com.callor.classes;

public class String_01 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;

		boolean bYes = num1 == num2;

		String str1 = "대한민국";
		String str2 = "우리나라";

		bYes = str1 == str2;

		str2 = "대한민국";
		if (str1 == str2) {
			System.out.println("맞아!!");
		}

		str1 = "우리나라";
		str2 = new String("우리나라");

		System.out.println(str1);
		System.out.println(str2);
		
		/*
		 * 문자열 변수에 담긴 문자열이 같은가를 확인할 때
		 * 동등연산자(==)를 사용해서는 안된다
		 * 
		 * 문자열 변수는 변수의 문자열을 저장하는 방법에 따라
		 * 다른 특성을 갖게된다
		 * 
		 * 문자열의 이 독특한 특성때문에
		 * 문자열에 저장된 값이 같은지 확인이 안되는 경우가 있다
		 * 
		 * 문자열 변수에 저장된 값이 같은가 비교를 할 때는
		 * 문자열.equals("비교대상") 메서드를 사용해야한다
		 */

//		if (str1 == str2) { => 절대 사용하지 말것
		//if (str2.equals(str1)) { => 순서 바꾸는 것도 가능
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같은값");
		} else {
			System.out.println("두 값은 달라달라");
		}
		
		//영문 문자열이 저장된 경우
		//대소문자가 서로 다르면 다른 문자열이 된다
		str1 = "KOREA";
		str2 = "Korea";
		System.out.println(str1.equals(str2));
		//영문 문자열이 저장된 경우
		//대소문자가 달라고 같은지 비교하기 위해서는 IgnoreCase()를 사용한다
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
