package com.samsung.tv;

// 같은 용도의 클래스들의 기능의 바운더리를 설정하는 역할과 더불어
// 같은 인터페이스를 구현한 클래스들의 객체 생성시 인터페이스 타입을 활용할 수 있도록 함으로서
// 형변환의 불편을 극복하는 다형성을 극대화한다.
public interface TV {
	public void powerOn();
	public void powerOff();
	public void volumnUp();
	public void volumnDown();
	
}
