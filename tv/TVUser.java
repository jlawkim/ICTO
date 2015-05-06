package com.samsung.tv;

// 사용단에서는 팩토리를 통해 객체를 전달받아 기능만을 활용하는 형태의 팩토리 디자인 패턴을 적용한 모습이다.
// 따라서 사용자의 입장에서는 코드의 유지 변경에 관여할 필요가 일절 없으며,
// 뒷단(코드단)의 변경에도 불구하고 동일한 기능을 뽑아 활용하기만 하면 된다.
// 핸드폰의 유심칩과 유사한 개념이 바로 인터페이스를 활용한 폴리모피즘이다.
public class TVUser {
	public static void main(String[] args) {
		TVFactory factory = new TVFactory();
		TV tv = factory.getBean("lg");
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
	}
}
