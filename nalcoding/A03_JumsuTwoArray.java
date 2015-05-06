package com.samsung.biz.nalcoding;

public class A03_JumsuTwoArray {
	public static void main(String[] args) {
		String[] name = {"홍길동", "임꺽정", "일지매"};
		/*int[] hong = {90, 75, 85, 0, 0};
		int[] im = {80, 75, 95, 0, 0};
		int[] jimea = {90, 95, 100, 0, 0};*/
		
		// 배열 타입을 다시 배열로 묶어 2차원 배열을 형성할 수 있다. 이 외에 3차원 4차원 등도 가능하다.
		int[][] jumsu = {{90, 75, 85, 0, 0}, {80, 75, 95, 0, 0}, {90, 95, 100, 0, 0}};
		
		// 2차원 배열이므로 2중 반복문이 필요하다. 행과 열을 순차적으로 모두 돌기 위함이다.
		for (int i = 0; i < jumsu.length; i++) { // 3
			for (int j = 0; j < 3; j++) { // 5
				jumsu[i][3] = jumsu[i][3] + jumsu[i][j];
			}
			jumsu[i][4] = jumsu[i][3] / 3;
			
			System.out.println(name[i] + " 님의 총점은 " + jumsu[i][3] + " 이고 평균은 " + jumsu[i][4] + " 입니다.");
		}
	}
}
