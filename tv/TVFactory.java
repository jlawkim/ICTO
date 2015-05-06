package com.samsung.tv;

// 인터페이스를 활용한 다형성에도 불구하고 유지보수의 부족한 부분을 보완하는 팩토리 디자인 패턴이다.
// 팩토리를 활용하여 객체를 리턴받아 사용하게끔 함으로서 객체 선언을 매번 바꾸는 일을 최소화하고
// 사용자 입장에서의 수정을 없앨 수 있다는 장점이 있다.
public class TVFactory {
	
	public TV getBean(String tv) {
		if (tv.equalsIgnoreCase("samsung"))
			return new SamsungTV();
		else
			return new LgTV();
	}
	
}
