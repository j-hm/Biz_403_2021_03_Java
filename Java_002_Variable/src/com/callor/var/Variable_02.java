package com.callor.var;

public class Variable_02 {
	public static void main(String[] args) {
		
		/*
		 * 변수 명명법
		 * 첫글자는 반드시 영문소문자
		 * 이어서 영문대소문자, 숫자, 언더바(_) 사용가능
		 * 2개 이상의 단어를 조합하여 사용하기를 권장
		 * 단어를 조합할 경우 두번째 단어부터는 첫글자 대문자
		 * 또는 단어와 단어사이를 언더바로 구분
		 * 
		 * intNum1 = camel case
		 * int_Num_1 =snake
		 * int_Num1
		 * 
		 * 변수의 접두사로 변수의 타입을 설정하는 것을 권장
		 * 
		 * intNum = 헝가리언 표기법 (요즘 안쓴단디 암튼 자바에서 쓰면 좋다함)
		 * floatNum
		 */
		
		// 정수형 변수 선언과 clear
		// 정수형 변수 intNum1, intNum2 생성
		int intNum1 = 0; //기본형 (주로 사용)
		Integer intNum2 = 0; //확장형
		
		// 실수형 변수 선언과 clear
		// 실수형 변수 douNum1, douNum2 생성
		double douNum1 = 0.0;
		Double douNum2 = 0.0;
		
		// 실수형 변수 생성 (주로 사용)
		// 기억장치를 소모하는 용량이 더블보다 작다
		// 대신 정밀도는 낮다
		float floatNum1 = 0.0f;
		Float floatNum2 = 0.0F;
		
		
		// w정수형 변수 생성
		// int보다 기억장치 소모용량이 크다
		// int 최대 2의 32승만큼 공간
		// long 최대 2의 64승만큼 공간
		long longNum1 = 0l;
		Long longNum2 = 0L;
		
		// 문자열형 변수를 선언하고 clear
		// 문자'열'형 변수를 생성
		String strName1 = ""; // " "<-이것과는 다른 값임
		String strName2 = null;
		
		intNum1 = 30;
		intNum2 = 40;
		
		floatNum1 = 30.0F;
		floatNum2 = 40.2F;
		
		longNum1 = 30l;
		longNum2 = 40l;
		
		douNum1 = 0.0;
		douNum2 = 0.0;
		
		strName1 = "박성화";
		strName2 = "";
		
	}

}
