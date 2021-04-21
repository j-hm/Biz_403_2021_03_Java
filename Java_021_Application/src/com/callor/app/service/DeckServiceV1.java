package com.callor.app.service;

import java.util.List;
import java.util.Random;

import com.callor.app.model.DeckVO;

public class DeckServiceV1 {

	protected List<DeckVO> deckList;
	String strSuit = "다이아(◆):하트(♡):스페이드(♠):클로버(♣)";
	String strDenom = "A234567890KQJ";

	public void getDeck() {
		Random rnd = new Random();
		int nSize = deckList.size();
		int deckIndex = rnd.nextInt(nSize);
		
		DeckVO retDeckVO = deckList.get(deckIndex);
		
	}
	
	public void makeDeck() {
		String[] denoms = strDenom.split("");
		String[] suits = strSuit.split(":");

		for (String suit : suits) {
			for (String denom : denoms) {
				Integer intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (NumberFormatException e) {
					//denom 문자열이 A,K,Q,J일 경우 Exception
					if(denom.equals("A")) intValue = 0;
					else intValue = 10;
				}
				DeckVO deckVO = new DeckVO();
				deckVO.setSuit(suit);
				deckVO.setDenomination(denom);
				deckVO.setValue(intValue);
				deckList.add(deckVO);
			}
		}
	}

}
