package oop.modifier9;

public class IPhone {
	//변수 : 멤버변수, 정적(static)변수
	//-멤버변수는 "객체"마다 다를 수 있는 정보 
	private int price;
	private String color;
	//-정적변수는 "모든 객체"가 동일해야 하는 정보 
	private static String company = "apple";//제조사(모든 객체가 동일해야하며, 바뀌더라도 다 같이 바뀌어야한다)
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		IPhone.company = company;
	}
	
	
}
