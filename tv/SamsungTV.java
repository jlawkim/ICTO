package com.samsung.tv;

// LG TV 클래스와 마찬가지로 TV 인터페이스를 구현한 클래스이다.
// 인터페이스 타입을 통한 다형성과, 클래스 내부 기능의 바운더리를 설정해 코드의 변경과 유지보수의 편의를 도모한다.
public class SamsungTV implements TV{
	public void powerOn(){
		System.out.println("SamsungTV => 전원 켜기");
	}
	
	public void powerOff(){
		System.out.println("SamsungTV => 전원 끄기");
	}
	
	public void volumnUp(){
		System.out.println("SamsungTV => 소리 올리기");
	}
	
	public void volumnDown(){
		System.out.println("SamsungTV => 소리 내리기");
	}
}
