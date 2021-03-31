package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV3 extends IolistServiceV1{

	@Override
	public void input() {
		// TODO 매입매출 등록하기
				System.out.println("=====================");
				System.out.println("매입 매출 등록");
				System.out.println("---------------------");
				System.out.println("상품명(QUIT : 입력중단)>> ");
				String pname = scan.next();
				if(pname == "QUIT") {
					return;
				}

				System.out.println("거래일자(YYYY-MM-DD)>> ");
				String date = scan.next();

				System.out.println("거리처명>> ");
				String dname = scan.next();

				System.out.println("매입매출 구분>> ");
				String inout = scan.next();

				System.out.println("수량>> ");
				Integer qty = scan.nextInt();
				
				Integer iprice = this.inputPrice("매입");
				if(iprice == null) {
					return;
				}
				Integer oprice = this.inputPrice("매출");
				if(oprice == null) {
					return;
				}
				
				IolistVO vo = new IolistVO();
				vo.setPname(pname);
				vo.setDate(date);
				vo.setDname(dname);
				vo.setInout(inout);
				vo.setQty(qty);
				vo.setIprice(iprice);
				vo.setOprice(oprice);

				iolist.add(vo);

	}
	
	private Integer inputPrice(String title) {
		
		while(true) {
			System.out.println(title + "단가를 입력하세요");
			System.out.println(title + "단가는 0이상 입력하세요");
			System.out.println("-1을 입력하면 입력중단");
			System.out.print(title + "단가>> ");
			Integer price = scan.nextInt();
			if(price == -1) {
				return null;
			} else if (price < 0) {
				System.out.println(title + "단가는 0이상입렧하세요");
			}else {
				return price;
			}
		}
		
	}

	
}
