package oop.modifier4;

public class Account {
	
	//멤버변수
	private final String accountNumber; // 고유번호 변경 불가 
	private String name;
	private long balance;
	private final float rate; // 이율 변경 불가 
	
	//생성자를 만들지 않으면 기본 생성자(default constructor)를 내장시켜준다
	//= 클래스는 객체 생성이 목표이기 때문에 생성자가 없으면 생성 불가능하다
	//= 생성자를 만드는 순간 사라진다
	//public Account(){}
	
	//생성자
	public Account(String accountNumber, String name, float rate) {
		this(accountNumber,name,0L,rate); // 다른 생성자로 데이터 전달(최상위에 1개만 작성되어야함)
//		this.accountNumber = accountNumber;
//		this.name = name;
//		this.balance = 0L;
//		this.rate = rate;
	}
	public Account(String accountNumber, String name, long blance, float rate) {
		this.accountNumber = accountNumber;//final
		this.setName(name);
		this.setBalance(blance);
		this.rate = rate; //final 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		if(balance<0) {
			return;
		}
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public float getRate() {
		return rate;
	}
	
	//일반메소드
	//접근제한 반환형 이름(매개변수){}
	
	//예금(deposit)기능
	//= 음수 예금 불가 
	public void deposit(long balance) {
		if(balance<0)return;
		this.balance+=balance;
	}
	//출금(withdraw)기능
	//= 음수 출금 불가 및 잔액보다 많은 금액의 출금은 불가 
	public void withdraw(long balance) {
		if(balance<0) return;//음수차단
		if(balance>this.balance) return;//잔액 초과시 차단 
		this.balance-=balance;
	}
	
	//출력기능
	public void output() {
		System.out.println("<통장정보>");
		System.out.println("고유번호: "+this.accountNumber);
		System.out.println("이름: "+this.name);
		System.out.println("이자율: "+this.rate);
	}
	}