package com.callor.var;

public class Variable_06 {
	public static void main(String[] args) {
		
		int intNum = 0;
		
		// intNum = intNum + 1
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		
		intNum = 0;
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		
		
		intNum =0;
		//1
		intNum += 1;
		System.out.println(intNum);
		
		//26과 27명령문을 한 명령문으로 만들면 아래 코드
		// : 1일 더하고 출력하라는 말
		System.out.println(++intNum);
		
		//2
		System.out.println(intNum);
		intNum += 1;
		
		//34와 35를 한 명령문으로 만들면 아래코드
		// : 출력하고 1을 더하라는 말
		System.out.println(intNum++);
		
		
	}

}
