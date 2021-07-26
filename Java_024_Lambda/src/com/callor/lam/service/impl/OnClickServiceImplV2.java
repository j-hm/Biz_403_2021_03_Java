package com.callor.lam.service.impl;

import com.callor.lam.service.OnClickService;

public class OnClickServiceImplV2 implements OnClickService{

	@Override
	public void onClick(String msg) {
		// TODO Auto-generated method stub
		msg += "노래";
		System.out.println(msg);
	}

}
