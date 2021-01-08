package oop.modifier4;

public class Test01 {
	public static void main(String[] args) {
		Account a = new Account("11011350", "유재석", 100000000L, 2.2f);
		Account b = new Account("11011355", "강호동", 50000000L, 2.1f);
		Account c = new Account("11011358", "신동엽", 30000000L, 2.5f);
		
		a.deposit(50000000L);
		b.deposit(20000000L);
		c.withdraw(10000000L);
		
		a.output();
		b.output();
		c.output();
	}
}