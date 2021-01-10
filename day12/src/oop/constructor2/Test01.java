package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		
		User a = new User("테스터1", "마법사");
		User b = new User("테스터2", "전사", -1, -200);
		User c = new User("운영자", "마법사", 999, 999999);
		
		a.output();
		b.output();
		c.output();
	}
}
