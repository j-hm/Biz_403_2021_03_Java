package com.callor.var;

public class Variable_20 {
	public static void main(String[] args) {
		
		int intKor = 91;
		int intEng = 82;
		
		int intSum = intKor + intEng;
		
		System.out.printf("%d + %d = %d\n", intKor, intEng, intSum);
		// System.out.printf("%d + %d + %d", intKor, intEng
		//									, intKor + intEng);
		// 변수 지정해놓고 연산 일일히 쓰는 ezr 하지 말기~
		
		
		//논리적인 오류 : 정수로 선언했기 때문에 소수점이하 절삭(원래는 86.5점임)
		int avg = (intKor + intEng) / 2;
		avg = intSum / 2;	
		System.out.println("평균 : " + avg);
	}

}
