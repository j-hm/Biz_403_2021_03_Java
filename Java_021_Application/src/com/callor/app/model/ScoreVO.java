package com.callor.app.model;

public class ScoreVO {

	private String strNum;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	private Integer tatal;
	private Integer avg;
	
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	
	// using fields
	public ScoreVO(String strNum, Integer kor, Integer eng, Integer math, Integer tatal, Integer avg) {
		super();
		this.strNum = strNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tatal = tatal;
		this.avg = avg;
	}



	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTatal() {
		return tatal;
	}
	public void setTatal(Integer tatal) {
		this.tatal = tatal;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tatal=" + tatal
				+ ", avg=" + avg + "]";
	}
	
	
}
