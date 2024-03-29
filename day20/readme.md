# 추상화(abstract)
추상화란 공통된 기능들을 가진 클래스에서 공통점들을 추출하여 상위 개념을 만드는 과정을 말함

## 추상 메소드
- 메소드의 실행 내용은 없고 선언부만 있는 메소드(미완성 메소드)
- 자식 객체에서 반드시 오버라이딩으로 작성하도록 만들어 줌(안만들면 오류발생)
	- 자신을 상속받는 자식들에게 강제적으로 메소드를 만들게 할 수 있음
- 추상 메소드가 하나라도 있으면 클래스도 추상 클래스가 되어야 함
```java
[public | protected] abstract 리턴타입 매소드명(매개변수);
```

## 추상 클래스 
- 추상 클래스는 객체 생성 불가능(미완성 클래스)
- 추상 메소드가 하나라도 있으면 무조건 추상 클래스가 되어야 함
- 추상 메소드가 없어도 추상 클래스가 될 수 있음 -> 객체 생성이 불가능한 클래스로 만들고 싶은 경우 사용
- 추상 클래스 용도
	- 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
	- 다형성 구현
```java
public abstract class 클래스명 { ... }
```

# 추상화 실습(poly2.abst2) 
자동차 만들기
- 아반떼
	- 기능 : 시동걸기(engineStart) - 키를 돌려서 시동, 기어변경(gearChange) - 막대를 움직여서 기어 변경, 창문조절(windowControl) - 손잡이를 돌려서 조절
- 그랜져
	- 기능 : 시동걸기(engineStart) - 버튼을 눌러서 시동, 기어변경(gearChange) - 버튼으로 기어 변경, 창문조절(windowControl) - 버튼을 눌러서 조절
- 제네시스
	- 기능 : 시동걸기(engineStart) - 휴대폰 앱으로 시동, 기어변경(gearChange) - 제어판을 터치해서 기어 변경, 창문조절(windowControl) - 제어판을 터치해서 조절

- 추상화를 이용해 구현
- 전체 코드가 반복해서 실행되도록 구현
- 1~3번을 입력하면 시승 기능 수행
- 9번을 선택하면 프로그램 종료
- 그 외 값을 입력하면 "잘못 입력하셨습니다. 다시 입력하세요." 출력 후 반복

- 실행 화면
```
## VR 차량 시승 시뮬레이션 프로그램 ##
1.아반떼
2.그랜져
3.제네시스
9.그만하기
시승할 차 번호를 선택하세요 : 1
[ Avante 탑승 ]
키를 돌려서 시동을 걸었습니다~ 부릉부릉~~
막대를 움직여서 기어를 변경했습니다~!
손잡이를 돌려서 창문을 내립니다~ 끼익~끼이익~~
```

## 추상화 과제
회원 등급별 포인트 관리 프로그램
- 등급은 silver, gold, vip 등급이 있음
- 등급별 이자율이 다름
  - 실버 등급 : 0.02%
  - 골드 등급 : 0.03%
  - VIP 등급 : 0.05%
- 등급 별 회원정보(이름, 등급, 포인트)를 입력하면 이자포인트를 계산해서 출력
  - 이자포인트 계산식 : 포인트 * 이자율
- 다형성과 추상화를 이용하여 구현

- 입/출력은 메인에서 실행

|이름|등급|포인트|이자포인트|
|------|---|---|---|
|홍길동|실버|1000|20.00|
|김말똥|실버|2000|40.00|
|똥똥이|실버|3000|60.00|
|김부장|골드|1000|30.00|
|박부장|골드|2000|60.00|
|홍사장|Vip|1000|50.00|

---

# 인터페이스(interface)
- 클래스를 구현하기 위한 가이드라인 또는 규격
- 위키 : 클래스들이 구현해야 하는 동작을 지정하는데 사용되는 추상 자료형
- 인터페이스로 선언되어 만들어지는 객체를 인터페이스의 구현 객체 라고 함

## 사용법
인터페이스 선언
```java
public interface 인터페이스명 {
	....
}
```

인터페이스 구현
```java
public class 클래스명 implements 인터페이스명 {
	...
}
```

다중 인터페이스 구현 시 콤마(,) 로 구분해서 나열
```java
public class 클래스명 implements 인터페이스명1,인터페이스명2,인터페이스명3,... {
	...
}
```

인터페이스 간의 상속 시에는 extends 사용
```java
public interface 인터페이스명 extends 부모인터페이스명 {
	...
}
```

## 인터페이스 문제풀이(poly3.inter2)
람보르기니 자동차 만들기(Lamborghini)

- 자동차(Car) 클래스 : 시동걸기(engineStart), 기어변경(gearChange)
- 네비게이션(Navigation) 인터페이스 : 목적지 입력(destination), 길안내(directions)
- 선루프(Sunroof) 인터페이스 : 열기(sunroofOpen), 닫기(sunroofClose)
- 라디오(Radio) 인터페이스 : 채널 변경(channelChange), 라디오 듣기(listenRadio)

- 메인에서 자동차의 모든 기능 실행
