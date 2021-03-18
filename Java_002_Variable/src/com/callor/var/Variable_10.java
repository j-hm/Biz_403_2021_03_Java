package com.callor.var;

public class Variable_10 {
	public static void main(String[] args) {
		
		int intNum1 =1; //시작값
		
		//명령이 실행될떄마다 1씩 증가하는 값으로 설정
		intNum1 ++; //시작값+1
		intNum1 ++; //시작값+1+1
		
		intNum1 = 100;
		intNum1 ++; //101
		intNum1 ++; //102
		
		intNum1 = 0;
		int intSum = 0;
		
		
		// 1씩 증가(변화)되는 intNum변수의 값을 intSum 변수에 누적한다(쌓는다)
		intSum += intNum1; // intSum=0
		intSum += ++intNum1; // intSum=1
		intSum += ++intNum1; // 저장되었던 썸값 1 저장되었던 넘버값(1+1)이 만나 지금 썸값3
		intSum += ++intNum1; // 저장되었던 썸값 3 저장되었던 넘버값(2+1)이 만나 지금 썸값6
		
		intNum1 = 1;
		intSum = 0;
		
		intSum += intNum1++;
		
		
	}

}
