package com.samsung.biz.nalcoding;

// VO를 통해 데이터를 저장하고, 데이터를 활용하는 것은 DAO에서 VO 객체를 생성한 후 활용한다.
// 데이터의 입출력과 활용단을 분리함으로서 유지보수를 용이하게 할 수 있다.
public class A05_JumsuDAO {
	
	private A05_Jumsu jumsu = null;
	
	// 객체를 생성함에 있어 기본 생성자가 필수적이다. 기본 생성자는 생성자 오버로딩 시 JVM이 자동 생성해주지 않으므로
	// 되도록 필수적으로 선언해 두는 것이 좋다.
	public A05_JumsuDAO(){
	}
	
	// 생성자 오버로딩을 통해 객체의 초기화 형태를 설정할 수 있다.
	public A05_JumsuDAO(String name, int kor, int eng, int math) {
		jumsu = new A05_Jumsu();
		jumsu.setName(name);
		jumsu.setKor(kor);
		jumsu.setEng(eng);
		jumsu.setMath(math);
	}

	public void onTotal(){
		jumsu.setTotal(jumsu.getKor()+jumsu.getEng()+jumsu.getMath());
	}
	
	public void onAvg(){
		jumsu.setAvg(jumsu.getTotal() / 3);
	}

	public void onAvg(int su){
		jumsu.setAvg(jumsu.getTotal() / su);
	}
	
	void display(){
		onTotal();
		onAvg();
		System.out.println(jumsu.getName() + " 님의 총점은 " + jumsu.getTotal() + " 이고 평균은 " + jumsu.getAvg() + " 입니다.");
	}
}
