package com.callor.controller;

public class Cont_01 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		
		System.out.println("======================");
		//같은 코드를 복붙하지 않고 명령문을 사용하여 반복하도록 수행
		//제어(Control)명령
		//main()메서드의 코드는 Topdown으로 진행이 된다
		//코드가 정상적으로 진행되는 과정에서 for() 명령문을 만나면
		//조건을 검사하고 조건에 따라 반복하는 코드가 실행된다
		//이처럼 Topdown으로 진행되는 코드의 흐름을 바꾸는 명령을 제어 명령이라 한다
		for (;intNum < 10;) { //가급적 두번째 명령문 안에 ++사용하지 말 것
			System.out.println((++intNum) + ". 우리나라 대한민국");
			
			/*
			 * 위와 같은 명령문
			 * for (;intNum < 10; intNum++)
			 * 		System.out.println(intNum + ". 우리나라 대한민국");
			 * 
			 * 
			 * 	또 다른 버전
			 * for ( intNum = 0 ; intNum < 10 ; intNum++ ) 넘버클리어까지 추가
			 * 		System.out.println(intNum + ". 우리나라 대한민국");
			 * 
			 * 1. for() 명령을 만나면 intNum = 0을 실행한다
			 * 이 명령은 반복횟수와 상관없이 최초의 한 번만 실행
			 * 
			 * 2. intNum < 10을 실행하여 조건을 검사 후
			 * 결과가 트루면 {}의 명령을 실행
			 * 
			 * 3. 명령 실행이 끝나면 다시 포 명령문으로 되돌아 온다
			 * intNum++ 명령을 실행
			 * 		증가 : intNum++ 명령을 실행
			 *	 	조건검사 : intNum < 10
			 * 
			 * 증가, 조건검사를 반복하면서 
			 * 조건검사 결과가 False가 될때까지(조건검사 결과가 True일 동안)
			 * 반복하여 {}명령문 실행
			 */
		}
		System.out.println("======================");
	}

}
