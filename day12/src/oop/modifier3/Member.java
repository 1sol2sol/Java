package oop.modifier3;
//회원 정보
// = 아이디 + 비밀번호 + 닉네임
// = 아이디는 변경 불가, 비밀번호나 닉네임은 변경 가능 
// = 변경 불가 키워드인 final을 사용하여 변수에 변경불가 효과를 부여 
// = final의 위치는 상관없다 
// = 멤버 변수에 final을 붙이면 오류가 발생한다.왜? 값이 할당되지 않았는데 변경불가가 되버리기 때문 
// = 해결하려면 초기값을 주거나, 주지 않을것이라면 "생성자"를 활용해야한다. 
public class Member {
	private final String id;
	private String password;
	private String nickname;
	
	public Member(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}
//	final 항목은 setter 메소드를 만들 수 없다 
//	= final 항목을 초기화(assigned)할 수 없기 때문에
//	public void setId(String id) {
//		this.id = id;
//	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	

}
