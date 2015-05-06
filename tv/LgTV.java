package com.samsung.tv;

// 삼성TV 클래스와 마찬가지로 TV 인터페이스를 구현한 클래스이다.
// 같은 인터페이스를 구현함으로서 메서드의 형태(틀)이 동일하게 유지되므로
// 코드의 변경이 필요한 경우 최대한 간단하게 편의를 도모할 수 있다.
// 한편 객체생성시 인터페이스 타입을 활용한 다형성을 활용할 수 있다.
public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV => 전원 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV => 전원 끄기");
	}

	@Override
	public void volumnUp() {
		System.out.println("LgTV => 소리 올리기");
	}

	@Override
	public void volumnDown() {
		System.out.println("LgTV => 소리 내리기");
	}
}
