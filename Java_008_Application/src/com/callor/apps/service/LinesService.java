package com.callor.apps.service;

public class LinesService {

	public static String dLines(int length) {
		/*
		 * 누군가 LinesService.dLines(10)형식으로 호출하면 
		 * = 문자를 10개 생성하여 리턴하라
		 * 
		 * 누군가 LinesService.sLines(10)형식으로 호출하면
		 */
		String dLine = "";
		for (int i = 0; i < length; i++) {
			dLine += "=";
		}

		return dLine;
	}

	public static String sLines(int length) {

		String sLine = "";
		for (int i = 0; i < length; i++) {
			sLine += "-";
		}

		return sLine;

	}
}
