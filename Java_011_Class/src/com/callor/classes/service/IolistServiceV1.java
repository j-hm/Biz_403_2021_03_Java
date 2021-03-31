package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO;

/*
 * IolistVO는 1개의 데이터를 담을 수 있도록 설계하였다
 * 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 한다.
 * 데이터의 묶음을 처리할 떄는 보통 배열을 사용한다.
 * 하지만 배열은 그 구조상 사용이 다소 불편할 때가 많다
 * Java에서는 배열을 사용해야하는 프로젝트에서 
 *  List클래스를 사용한 객체를 생성하여 진행한다.
 */
public class IolistServiceV1 {

	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할텐데
	 * 매입매출 데이터들의 묶음을 List형 객체 사용하겠다
	 * 
	 * List형 객체에 포함된 (개별)데이터는 IolistVO형으로 사용하겠다 
	 * 
	 * 낱개 데이터는 IolistVO클래스 형으로 사용하고
	 *  그 데이터들을 묶어서 List형으로 연산을 수행하겠다, 라는 선언
	 *  
	 *  private 선언 : 
	 *  혹시 외부에서 iolist데이터에 접근하여 값을 저장하는 일을 방지하기 위함
	 *  
	 *  protected 선언 : 
	 *  V1클래스를 상속하여 선언할 시 사용
	 */
	protected List<IolistVO> iolist;
	protected Scanner scan;
	
	public IolistServiceV1() {
		iolist = new ArrayList<IolistVO>();
		scan = new Scanner(System.in);
	}
	
	public void input() {
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
		String input = scan.next();
		
		System.out.println("수량>> ");
		Integer qty = scan.nextInt();

		System.out.println("매입단가>> ");
		Integer iprice = scan.nextInt();

		System.out.println("매출단가>> ");
		Integer oprice = scan.nextInt();
		
		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(input);
		iolistVO.setQty(qty);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		
		//저장한 데이터 확인하기!!
		this.printIolist(iolistVO);
		
	}
	
	public void printIolist(IolistVO vo) {
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\t");
	}
	
}
