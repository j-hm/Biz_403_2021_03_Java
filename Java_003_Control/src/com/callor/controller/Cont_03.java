package com.callor.controller;

public class Cont_03 {
	public static void main(String[] args) {
		
		//0~9까지 출력하기
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		/*
		 * i++와 i + 1의 차이
		 * 
		 * 1. 변수 i에 저장된 값이 변경되느냐 아니냐
		 * 
		 * 		i++ : i에 저장된 값이 1 증가하는 값으로 변경
		 * 			  변경된 i값을 다른 명령에서 사용하려고 할때
		 * 			  for() 반복문 내에서 i++를 사용할 때는 매우 주의를 해야한다
		 * 		i + 1 : i에 저장된 값은 변경되지 않는다
		 * 				i 변수에 저장된 값에 1을 덧셈하여
		 * 				임시적으로 다른 명령에서 사용하려고 할때
		 */
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println("==============================");
		for(int i = 0; i < 10; i++) {
			System.out.println("우리나라");
		}
		
		System.out.println("==============================");
		for(int i = 0; i < 10; i++) {
			int sum = i + 1; // 이거 썸값 왜 써놓은거임?;;
			System.out.println("대한민국");
		}
		
		System.out.println("==============================");
		for(int i = 0; i < 10; i++) {
			i++;
			System.out.println("Republic of Korea");
		}
		//위와 같은 코드
		//for(int i = 0; i < 10; i += 2) {
			//System.out.println("우리나라");}
		
		System.out.println("==============================");
		
		/*
		 * for() 반복문 내에서 i++를 실행하고
		 * {for본문명령문} 내에서 i--를 실행했다
		 * 이런 상황에 되면 i값은 i<10조건에서
		 * 항상 True인 상태가 되어 무한 반복되는 코드가 되어버린다
		 */
		for(int i = 0; i < 10; i++) {
			i--;
			System.out.println("i값이 영원히 0인 명령문");
		}
	}
}
