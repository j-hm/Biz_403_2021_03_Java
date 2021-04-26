package com.callor.fin;

import java.util.List;

import com.callor.fin.model.ScoreVO;

public class MainEx_06 {

	public static void main(String[] args) {
		List<ScoreVO> scoreList = null;
		for (int i = 0; i < 10; i++) {
			ScoreVO scoreVO = null; // 익셉션 발생 왜그럴까...? new ScoreVO로 초기화 해조야함~아마도~
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
		}
	}
}
