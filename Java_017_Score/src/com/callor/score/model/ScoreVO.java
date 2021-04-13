package com.callor.score.model;

/*
 * 데이터를 담아서 정보처리를 수행할 때
 * 편리하게 데이터를 묶어서 관리하기 위한 클래스
 * VO를 만드는 작업 : 데이터 모델링(설계하기)
 * 1. 추상화
 * 2. 정보은닉
 * 3. 캡슐화
 * 4. 재정의(Override)
 * 모델링된 ScoreVO를 실제로 사용할 때는 객체로 생성한다
 * ScoreVO scoreVO = new ScoreVO()
 * 필요할 때마다 객체로 생성하고, 데이터를 SETTER하고
 * 연산을 수행한 후 데이터를 GETTER하는 방식으로 활용한다
 * 
 * DB항목에서는 Entity 모델링이라고 한다.
 * 모델링 된 Entity 데이터 테이플Data TABLE로 생성하여 사용한다
 * 한번 테이블을 생성하고 영구적으로 사용한다
 * 
 */
public class ScoreVO {
	private String num;
	private String name;
	
	//VO클래스에 숫자형 변수를 선언할 때
	//primitive형이 아닌 wrapper클래스 형으로 선언할 때는 0으로 clear해주자
	//이러한 불편을 방지하기 위하여 primitive형으로 만들기도 하지만
	//null값을 취급하기가 어려운 단점!이 발생한다
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;

	/*
	 * VO클래스를 모델링 하고(추상화) 변수를 private으로 선언하였다(정보은닉). 
	 * 은닉된 변수에 접근하기 위하여 GETTER와 SETTER 메서드를 생성
	 * 
	 * 게터와 세터를 생성하고 봤더니 총점과 평균은 점수가 입력되면 항상 계산되어야 하는 항목이다 
	 * 즉, 외부에서 이 변수에 값을 저장할 일이 별로 없을 것 같다
	 *  ; 외부에서 total과 avg값을 요청하면 그때 그때 계산해서 return하면 될 것 같다
	 * 
	 * 1. total, avg 변수를 삭제하고 
	 * 2. 위 변수의 set메서드를 제거
	 *  3. 위 변수의 get메서드를 변경 
	 *  ==> 과목 총점과 평균을 계산하여 return하기
	 * 
	 */
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
/*
 * 외부에서 객체.getTotal()메서드를 호출하면
 * 과목의 총점을 리턴받을 수 있다
 * 
 * 실제 코드는 3과목의 총점을 계산하고
 * 계산된 결과를 리턴하는 구조로 되어있다
 * 
 * 하지만
 * 외부에서는 실제코드가 어떻게 작동되는지 몰라도
 * 또는
 * 관심갖지 않아도 상관없이 겟토탈 메서드는 잘 계산된 결과라는 것을 알고 있다
 * 
 * 이렇게 내부코드를 감추로(외부에 노출하지 않고도)
 * 기능을 충실히 수행할 수 있도록 하는 것
 *  : [캡슐화]
 */
	public Integer getTotal() {
		Integer total = this.kor;
		total += this.eng;
		total += this.math;
		return total;
	}

	public Float getAvg() {
		Float avg = Float.valueOf(getTotal()) / 3;
		return avg;
	}

	/*
	 * toString() method는 Object클래스에 정의되어 있으며
	 * 모든 클래스는 자동적으로 Object를 상속받는다
	 * 
	 * 따라서 ScoreVO클래스에는 
	 * 자동으로 toString() method가 있는 것처럼 동작할 것이다
	 * 
	 *  하지만, Object클래스에 정의된 toString() method는 사용하는데 의미가 없다
	 *  그래서 ---------를
	 *  VO객체의 변수에 담긴 값들을 문자열로 만들어
	 *  리턴하는 코드로 다시 작성을 한다
	 *  이제 vo객체.toString() method를 호출하면
	 *  vo객체의 변수들에 담긴 값들이 출력될 것이다
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math 
				+  ", total=" + this.getTotal() + ", avg=" + this.getAvg() + "]";
	}

}
