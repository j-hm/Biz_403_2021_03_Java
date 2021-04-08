package com.callor.app.service;


import com.jhm.standard.InputService;
import com.jhm.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	
	public static void main(String[] args) {
		InputService isV1 = new InputServiceImplV1();
		
		Integer korIn = isV1.inputValue("국어", 0, 100);
		Integer engIn = isV1.inputValue("영어", 0, 100);
		Integer mathIn = isV1.inputValue("수학", 0, 100);

		int sum = korIn + engIn + mathIn;
		float avg = (float) sum / 3;

		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%3.2f", korIn, engIn, mathIn, sum, avg);
	}
}
