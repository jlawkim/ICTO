package com.samsung.biz.nalcoding;

// 실제 데이터의 출력(사용단)의 모습 : 혹은 테스트를 위한 클래스
public class A05_JumsuMain {
	public static void main(String[] args) {

		A05_JumsuDAO hong = new A05_JumsuDAO("홍길동", 95, 75, 65);
		hong.display();

		A05_JumsuDAO im = new A05_JumsuDAO("임꺽정", 95, 100, 85);
		im.display();
		
	}
}
