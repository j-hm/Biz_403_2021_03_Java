package com.callor.var;

public class Variable_03 {
	public static void main(String[] args) {
		
		/*
		 * 변수성질 1
		 *  : 코드가 위에서 아래(TopDown)로 진행되는동안
		 *    이전에 변수에 어떤 값이 저장되었던 상관없이
		 *    읽는 시점 바로 전에 저장된 값만 유효하다
		 */
		int intNum1 = 0;
		
		intNum1 = 30;
		intNum1 = 40;
		intNum1 = 50;
		intNum1 = 0;
		/*
		 * 변수성질 2
		 *  : 변수에서 값을 읽는 명령(들)
		 *  	intNum1에 저장된 값을 읽어서 콘솔에 출력하라
		 *  : 변수에서 값을 읽는 명령이 몇번 수행되던 상관 없이
		 *    한번 변수에 저장된 값은 그대로 유지된다
		 */
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		/*
		 * 변수성질 3
		 *  : 변수에 값 저장, 할당, 대입
		 *    이때 대입연산자(=)를 사용한다.
		 * 
		 * 변수 = 값
		 * 변수 = 식
		 * 변수 = (또 다른) 변수
		 * 
		 *  : 대입연산자가 명령문 중에 나타나면
		 *    대입연산자 오른쪽이 먼저 실행된다
		 */
		intNum1 = 30;
		intNum1 = 30 + 40;
		intNum1 = intNum1;
		
		/*
		 * intNum1에 저장된 값(70)을 CPU에 복사해서 보내기
		 * 어딘가에 저장된 100을 CPU로 복사해서 보내기
		 * 두 수(70,100)를 덧셈하여 다시 intNum1에 저장
		 * 원래 intNum1에 저장된 값은 사라지고, 170이 intNum1에 저장된다
		 */
		intNum1 = intNum1 + 100;
		intNum1 = intNum1 * 2;
		intNum1 = intNum1 - 100;
		intNum1 = intNum1 / 2;
		//위아래 같은 코드랍니다
		intNum1 += 100;
		intNum1 *= 2;
		intNum1 -= 100;
		intNum1 /= 2;
		
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1; // 어떤 변수에 담긴 값을 1씩 증가 시키는 코드
		//위같코
		intNum1 ++;
		
		intNum1 --; // 같은 결로 1씩 감소(-)하는 코드
		
		//쬐끔 차이는 있지만 일단은 같은 코드 형식
		++ intNum1;
		-- intNum1;
		
		
		
		
	}

}
