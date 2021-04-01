package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;

	public PrimeServiceV1() {
		rnd = new Random();
	}

	public void primeNum() {
		Integer rndNum = rnd.nextInt(51) + 50;
		int i = 0;
		/*
		 *  for() 반복문이 실행되거나 끝나는 경우
		 *  비교문 "i < rndNum" true인동안 반복하라
		 *  만약 rndNum가 10이다
		 *   i == 9일때까지 반복하라
		 *  for() 반복문이 종료되면 i값은 얼마일까?
		 *  
		 *  i값이 rndNum보다 작으면 { }내의 코드실행
		 *  {}실행 후에 i++를 실행한다
		 *  i가 9가 되었을 때 {}를 실행하고
		 *  다시 한 번 i++실행된다
		 *  때문에 for() 반복문이 중단되지 않고 모두 정상수행되면
		 *  i값은 rndNum값과 같아진다
		 *  i == rndNum인데 i < rndNum냐고 묻는 것
		 *  
		 *  만약 for() 반복문이 중간에 break를 만났다
		 *  "i값은 항상 rndNum보다 작다"
		 */
		
		for (i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				//소수가 아닌 경우
				break;
			}
		} //for() end
		if (rndNum > i) {
			System.out.println(rndNum + " : 소수가 아니다");
		} else {
			System.out.println(rndNum + " : 소수다");
		}
	}
}
