package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.jhm.standard.InputService;
import com.jhm.standard.MenuService;
import com.jhm.standard.impl.InputServiceImplV1;
import com.jhm.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1 {

	protected MenuService menuService;
	protected InputService inService;

	public ScoreServiceImplV1Ex() {
		inService = new InputServiceImplV1();
		/*
		 * MenuServiceImplV1 클래스의 생성자는 두개의 매개변수(아규먼트, 파라메터)를 전달하면서 호출해야한다
		 * 첫번째 매개변수는 프로젝트의 title
		 * 두번째 매개변수는 업무리스트를 담을 List형 객체
		 * 
		 * title은 단순 문자열이기 때문에 바로 전달 할 수 있는데
		 * List형 객체는 List객체를 생성하고 데이터를 add한 후 전달해야 함으로
		 * 야간의 추가 연산 코드가 필요
		 * 
		 * 이럴 때 생성자 method에서 작성하지 않고
		 * 객체를 사용하는 메서드에서 작성하는 것이 좋다
		 */
		menuService = new MenuServiceImplV1(null, null);
	}

	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보등록");
		menuList.add("성적등록");
		menuList.add("성적정보열기");
		menuList.add("성적정보저장");
		menuList.add("성적정보출력");
		
		menuService = new MenuServiceImplV1(title, menuList);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				return;
			}
			
			/*
			 * if(menu == 1)
			 * if(menu == 2)
			 * if(menu == 3)
			 * 만약 menu변수의 값이 1일때 코드가 실행되고 코드가 종료
			 * 
			 * 또 다시 menu값이 2인지, 3인지 계속 검사하며 불필요하게 코드가 실행됨
			 
			 *
			 * if(menu == 1)
			 * else if(menu == 2)
			 * else if(menu == 3)
			 * 만약 menu변수 값이 1이면 menu가 1일 때 코드가 실행되고 코드 종료
			 * else이후의 코드는 무시하고 바로 if문이 종료됨
			 * 첫번째 코드에 비해 약간이나마 효율적인 코드가 됨
			 * 
			 */
			
			if(menu == 1) {
				
			} else if (menu == 2) {
				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				
			}
		}
	}
	
	
}
