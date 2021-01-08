package oop.modifier4;

public class Test02 {
	public static void main(String[] args) {
		Account[] list = new Account[3];
		
		list[0] = new Account("11011350", "유재석", 100000000L, 2.2f);
		list[1] = new Account("11011355", "강호동", 50000000L, 2.1f);
		list[2] = new Account("11011358", "신동엽", 30000000L, 2.5f);
		
		list[0].deposit(50000000L);
		list[1].deposit(20000000L);
		list[2].withdraw(10000000L);
		
		for(int i=0; i < list.length; i++) {
			list[i].output();
		}
	}
}