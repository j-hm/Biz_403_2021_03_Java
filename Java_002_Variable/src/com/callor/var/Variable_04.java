package com.callor.var;

public class Variable_04 {
	public static void main(String[] args) {
		
		int intDan = 9;
		int intNum = 12; //여기 숫자를 바꾸면 값도 따라 바뀌고 당연함
		
		System.out.println("================");
		System.out.printf("%d 구구단\n", intDan);
		System.out.println("----------------");
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);
		
		intNum ++;
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);
		
		intNum ++;
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);
		
		intNum ++;
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);

		intNum ++;
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);

		intNum ++;
		
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);

		
	}

}
