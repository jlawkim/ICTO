package com.samsung.biz.nalcoding;

public class A02_JumsuArray {
	public static void main(String[] args) {
		// 배열은 같은 타입의 변수가 여러 개 있을 경우, 한꺼번에 묶어서 관리의 편리를 도모하기 위한 개념이다.
		String[] name = {"홍길동", "임꺽정", "일지매"};
		int[] hong = {90, 75, 85, 0, 0};
		int[] im = {80, 75, 95, 0, 0};
		int[] jimea = {90, 95, 100, 0, 0};
		
		for (int i = 0; i < jimea.length; i++) {
			hong[3] = hong[0] + hong[1] + hong[2];
		}
		hong[4] = hong[3] / 3;
		
		for (int i = 0; i < jimea.length; i++) {
			im[3] = im[0] + im[1] + im[2];
		}
		im[4] = im[3] / 3;

		for (int i = 0; i < jimea.length; i++) {
			jimea[3] = jimea[0] + jimea[1] + jimea[2];
		}
		jimea[4] = jimea[3] / 3;
		
		System.out.println(name[0] + " 님의 총점은 " + hong[3] + " 이고 평균은 " + hong[4] + " 입니다.");
		System.out.println(name[1] + " 님의 총점은 " + im[3] + " 이고 평균은 " + im[4] + " 입니다.");
		System.out.println(name[2] + " 님의 총점은 " + jimea[3] + " 이고 평균은 " + jimea[4] + " 입니다.");
		
	}
}
