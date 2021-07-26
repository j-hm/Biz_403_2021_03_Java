package com.callor.lam;

import com.callor.lam.service.OnClickService;
import com.callor.lam.service.impl.OnClickServiceImplV1;

public class AppEx_01 {
	public static void main(String[] args) {
		System.out.println("다시만난세계");
		
		OnClickService on1 = new OnClickServiceImplV1();
		on1.onClick("신세계");
	}
}
