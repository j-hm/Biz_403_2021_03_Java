package com.callor.classes;

import java.util.Scanner;

public class ScannerEX_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		if (str.equals("end")) {
			System.out.println("안녕!");
		} else {
			System.out.println("반가워이");
		}
	}

}
