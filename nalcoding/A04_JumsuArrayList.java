package com.samsung.biz.nalcoding;

import java.util.ArrayList;

public class A04_JumsuArrayList {
	public static void main(String[] args) {
		// 배열은 선언 시 이미 정적으로 그 크기가 정해져 있다. 따라서 동적으로 크기를 조절할 수 없는 불편함이 있다.
		// 만일 데이터가 추가로 형성되는 경우 배열의 그런 경직성이 큰 불편을 초래한다.
		// 이 단점을 극복하기 위해 컬렉션 API : 맵, 리스트, 셋 등을 사용한다.
		// 가장 보편적인 것은 벡터와 어레이리스트, 해쉬 맵 등으로, 같은 타입의 데이터들을 동적으로 관리한다.
		 
		// 어레이리스트는 리스트 API를 사용했으므로 중복을 허용하고 순서를 기억한다.
		// <generic>을 통해 데이터 타입을 명시하여 데이터 입출력시 캐스팅을 줄여 편의를 도모했다. 
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("임꺽정");
		name.add("일지매");
		
		ArrayList<Integer> hong = new ArrayList<Integer>();
		hong.add(90);
		hong.add(80);
		hong.add(70);

		ArrayList<Integer> im = new ArrayList<Integer>();
		im.add(90);
		im.add(80);
		im.add(70);
		
		ArrayList<Integer> jimea = new ArrayList<Integer>();
		jimea.add(90);
		jimea.add(80);
		jimea.add(70);
	
		ArrayList<ArrayList<Integer>> jumsu = new ArrayList<ArrayList<Integer>>();
		jumsu.add(hong);
		jumsu.add(im);
		jumsu.add(jimea);
		
		int sum = 0;
		for (int i = 0; i < jumsu.size(); i++) {
			for (int j = 0; j < jumsu.get(i).size(); j++) {
				sum = jumsu.get(i).get(0) + jumsu.get(i).get(1) + jumsu.get(i).get(2);
			}
			jumsu.get(i).add(sum);
			jumsu.get(i).add(jumsu.get(i).get(3) / 3);
		}

		for (int k = 0; k < jumsu.size(); k++) {
			System.out.println(name.get(k) + " 님의 총점은 " + jumsu.get(k).get(3) + " 이고 평균은 " + jumsu.get(k).get(4) + " 입니다.");
		}
		
	}
}
