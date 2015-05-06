package com.samsung.biz.nalcoding;

// 클래스 역시 하나의 변수명(변수타입) 으로 활용한다.
// 배열이나 컬렉션과 달리 다양한 타입의 변수를 하나의 이름으로 관리할 수 있다.
// 해당 클래스는 값의 입출력만을 저장하는 VO로서, 값의 활용에 대한 기능들(메서드)은 DAO 클래스로 따로 분리해
// 운영을 용이하게 한다.
public class A05_Jumsu {
	// 데이터를 마음대로 수정하지 못하도록 private 접근 제어자로 막는 대신 getter, setter 메서드를 활용한다.
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
	
}
