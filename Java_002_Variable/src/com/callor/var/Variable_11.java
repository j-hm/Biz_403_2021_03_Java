package com.callor.var;

public class Variable_11 {
	
	public static void main(String[] args) {
		
		int intNum = 100000;
		//넘버값에 담김 앖을 1증가시키고 출력하라
		System.out.println(++intNum);
		
		int intSum =  0; //결과를 저장할 변수 생성
		intNum = 1; // 시작값을 1
		
		System.out.println("======================");
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		
		//intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		
		
		System.out.printf("intNum : %d, intSum : %d\n"
						  , ++intNum
						  , intSum += intNum);
		
		
		
	}

}
