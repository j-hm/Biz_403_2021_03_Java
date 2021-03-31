package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재정의한다
	 * 
	 * 매입단가, 매출단가는 반드시 0이상이어야한다
	 * 
	 * 유효성검사를 하도록 코드를 재정의한다
	 */
	@Override
	public void input() {
		// TODO 매입매출등록
		System.out.println("=====================");
		System.out.println("매입 매출 등록");
		System.out.println("---------------------");
		System.out.println("상품명>> ");
		String pname = scan.next();

		System.out.println("거래일자(YYYY-MM-DD)>> ");
		String date = scan.next();

		System.out.println("거리처명>> ");
		String dname = scan.next();

		System.out.println("매입매출 구분>> ");
		String inout = scan.next();

		System.out.println("수량>> ");
		Integer qty = scan.nextInt();

		// 매입단가와 매출단가는 0이상만 입려한다
		// 매입단가가 0이상이면 다음 항목입력받도록 while()을 중단하고
		// 매입단가가 0미만이면 계속해서 반복문내에서 입력을 받도록 함
		Integer iprice = 0;
		while (true) {
			System.out.println("매입단가>> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("단가는 0원 이상의 값을 입력");
			} else {
				break;
			}
		}

		Integer oprice = 0;
		while (true) {
			System.out.println("매출단가>> ");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("단가는 0원 이상의 값을 입력");
				continue;
			}
			break;
		}

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setQty(qty);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);

		iolist.add(iolistVO);

	}

}
