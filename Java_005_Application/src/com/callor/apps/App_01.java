package com.callor.apps;

import java.util.Random;
/*
 * 25~50명의 인원이 있는 각 반에
 * 피자간식을 지급하려고 한다
 * 각반의 학생들에게 피자를 한 조각씩 주고
 * 피자는 학생수보다 부족하거나 6조각 이상 남지 않도록 주문해라
 * 몇 박스를 주문해야하는지 코드로 구현하시오
 */
public class App_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		// rnd.nextInt(); -2**31 ~ 2**31-1 까지의 수

		// 25 ~ 50의 수 중에서 1개를 만들어라
		// rnd.nextInt();에 25를 더하고 시작
		int intMembers = rnd.nextInt(26) + 25;
		int pizzaPcs = 6;
		int pizzaBox = intMembers / pizzaPcs;

		/*
		 * boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0; 
		 * bYes값이 false일 경우 앞에 !표를 붙임 
		 * if( !bYes ) {
		 *  	pizzaBox++; 
		 *  }
		 */
		if (intMembers % pizzaPcs == 0) {
			System.out.printf("인원 %d명 피자 %d판", intMembers, pizzaBox);
		} else {
			System.out.printf("인원 %d명 피자 %d판", intMembers, pizzaBox + 1);
		}

	}

}
