package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV4() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}

	public void primeNum() {
		for (int i = 0; i < 50; i++) {
			Integer rndNum = rnd.nextInt(51) + 50;

			int index = 0;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}
			}
			if (rndNum <= index) {
				primeList.add(rndNum);
			}
		}
	}

	public void printPrimeNum() {

		System.out.println("=".repeat(20));
		System.out.println("소수 리스트");
		System.out.println("-".repeat(20));
		for (int i = 0; i < primeList.size(); i++) {
			Integer rndNum = primeList.get(i);
			System.out.println(rndNum);
		}
		System.out.println("=".repeat(20));
	}
}
