package com.callor.classes.service;

public class Lines {

	public static String dLine(int nCount) {

		// printf는 화면에 출력하는 form을 만드는 출력 method
		// String.formet()은 화면에 출력하는 대신 문자열로 만들어
		// 리턴하는 메서드
		// 만들어진 문자열을 dLine변수에 담는다
		
		//nCount값이 50이라면
		//%050d형식의 formet문자열이 생성될 것이다
		String dLine = String.format("%0" + nCount + "d", 0).replace("0", "=");

		return dLine;
	}
	
	public static String sLine(int nCount) {
		return String.format("%0"+nCount+"d", 0).replace("0", "-");
	}

}
