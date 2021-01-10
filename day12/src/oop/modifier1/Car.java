package oop.modifier1;

//아무런 접근제한이 표시되지 않으면 패키지 단위로 접근제한이 설정된다 

//= 자바에서는 기본 관리다누이가 패키지이기 때문(기본값)
//class Car{ => 다른 패키지에서는 접근 불가 

//외부 패키지에서도 접근을 허용하고 싶다면 
// = public을 붙여 "공개" 표시 설정
// = 변수를 제외한 대부분의 요소들은 public 선언
public class Car {
	private String name;
	private int price;

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}

}
