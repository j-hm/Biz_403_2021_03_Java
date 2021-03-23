package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급하려고 합니다
 * 학급의 인원은 50~59명입니다
 * 학급인원은 랜덤클래스를 이용하여 생성합니다
 * 피자는 한 판에 6조각입니다
 * 다음과 같이 주문리스트를 출력합니다
 */
public class App_04 {
	public static void main(String[] args) {
		
		int[] intClass = new int[5];
		Random rnd = new Random();
		int intTotal = 0;
		int pizzaPcs = 6;

		for (int i = 0; i < 5; i++) {
			int members = rnd.nextInt(10) + 50;
			intClass[i] = members;
		}
		// 학급별 주문수량을 계산하는 부분과
		//리스트를 출력하는 부분을 분리하자
		//1. 계산된 주문수량을 담아둘 장소를 생성
		//2. 저장된 수문수량을 사용하여 출력
		int[] intOrders = new int[5];
				
		for (int i = 0; i < 5; i++) {
			int order = intClass[i] / pizzaPcs;
			if (intClass[i] % (order * pizzaPcs) > 0)
				++order;
			intOrders[i] = order;
				}
		
		System.out.println("피자 주문서");
		System.out.println("=====================");
		System.out.println("순번\t인원수\tBOX\t조각");
		System.out.println("---------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "\t");
			System.out.print(intClass[i] + "\t");
			System.out.print(intOrders[i] + "\t");
			System.out.print((intOrders[i] * pizzaPcs) + "\t");
			intTotal += intOrders[i];
		}
		
		System.out.println("---------------------");
		System.out.println("전체 피자 박스 : " + intTotal);

	}

}


/*for (int i = 0; i < 5; i++) {
boolean bYes = intClass[i] % pizzaPcs == 0;
int pizzaBox = intClass[i] / pizzaPcs;
if (!bYes) {
	++pizzaBox;
}
System.out.printf("%d\t %d\t %d\n"
				, intClass[i], pizzaBox, (pizzaBox * pizzaPcs));
intTotal += pizzaBox;
}
*/