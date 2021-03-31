package com.callor.classes;

import java.util.Scanner;

public class ScannerEX_02 {

	public static void main(String[] args) {

		//숫자를 입력받는 nextInt()와
		//문자를 입력받는 nextLine()을 혼합하여
		//코드를 작성하면 여러가지 문제 발생~
		Scanner scan = new Scanner(System.in);


		System.out.print("국어>> ");
		int intKor = scan.nextInt();
		
		System.out.print("이름>> ");
		String strName = scan.nextLine();


		System.out.printf("%s의 국어성적 : %d\n", strName, intKor);

	}

}
