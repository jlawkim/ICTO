package com.samsung.biz.nalcoding;

// 가장 기본적인 형태로 데이터의 입출력을 처리
public class A01_Jumsu { // 클래스 선언부 : 클래스 이름, 코드 블럭으로 이루어진다.
	public static void main(String[] args) { // 클래스 내부 메서드 선언부.
//  접근 제어자, 동적 메서드(객체생성 없이 사용 가능), 리턴타입(메서드의 결과 산출 값 없음), 메서드 이름(참조변수 타입, 참조변수 이름 : 메서드 활동에 필요한 참조값) 
  		String hongName = "홍길동";
		int hongKor = 90;
		int hongEng = 75;
		int hongMath = 85;
		int hongTotal = hongKor + hongEng + hongMath;
		int hongAvg = hongTotal / 3;
		System.out.println(hongName + " 님의 총점은 " + hongTotal + " 이고 평균은 " + hongAvg + " 입니다.");

		String imName = "임꺽정";
		int imKor = 100;
		int imEng = 95;
		int imMath = 85;
		int imTotal = imKor + imEng + imMath;
		int imAvg = imTotal / 3;
		System.out.println(imName + " 님의 총점은 " + imTotal + " 이고 평균은 " + imAvg + " 입니다.");

		String jimeaName = "일지매";
		int jimeaKor = 100;
		int jimeaEng = 95;
		int jimeaMath = 100;
		int jimeaTotal = jimeaKor + jimeaEng + jimeaMath;
		int jimeaAvg = jimeaTotal / 3;
		System.out.println(jimeaName + " 님의 총점은 " + jimeaTotal + " 이고 평균은 " + jimeaAvg + " 입니다.");
	}
}

