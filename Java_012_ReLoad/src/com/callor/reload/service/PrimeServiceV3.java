package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1 {

	public void primeNum() {
		int rndNum = rnd.nextInt(51) + 50;
		// for반복문이 중단되었는냐
		// 아니면 모두 수행했느냐

		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		//for문이 끝났을 때 break되었을 때
		//		항상 index < rndNUm
		// 그렇지 않은 경우를 확인하여 코드진행
		//		index == rndNUm가 된다
		
		if(index < rndNum) {
			System.out.println(rndNum + " : 소수가 아님");
		} else {
			System.out.println(rndNum + " : 소수");
		}
	}

}
