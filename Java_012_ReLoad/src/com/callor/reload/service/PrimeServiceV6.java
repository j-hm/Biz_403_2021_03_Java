package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV6 {

	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV6() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}

	public void primeNum() {
		for (int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			if (this.isPrime(rndNum)) {
				primeList.add(rndNum);
			}
		}
	}

	// 매개변수(rndNum)로 전달받은 정수가
	// 소수인지 아닌지를 리턴하는 메서드
	// return값이 트루이거나 폴스인 메서드
	// isPrime() : 프라임이 맞냐
	private boolean isPrime(int rndNum) {
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return false;
			}
		}
		return true;
	}

	private void addPrime(int rndNum) {
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return;
			}
		}
		primeList.add(rndNum);
	}

	public void printPrime() {
		int nSize = primeList.size();
		System.out.println("=".repeat(50));
		System.out.println("소수개수 : " + nSize);
		System.out.println("-".repeat(50));
		for (int i = 0; i < nSize; i++) {
			System.out.print(primeList.get(i) + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=".repeat(50));
	}

}
