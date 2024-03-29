# API(Application Programming Interface)
- 프로그래밍을 할 때 어떠한 특정 기능을 처리 할 수 있도록 만들어 놓은 클래스나 메소드의 집합

- 윈도우 API : 윈도우 운영체제를 프로그래밍 할 수 있도록 미리 여러가지 기능을 정의해놓은 API
- 자바 API : 자바 언어를 사용하여 특정 기능을 구현 할 수 있도록 미리 여러가지 기능을 정의해놓은 API
- 웹 API : 웹 개발에서 개발해 놓은것을 이용하여 손 쉽게 개발 할 수 있도록 미리 여러가지 기능을 정의해놓은 API

---

# String API
문자열을 처리하기 위한 기능

## String 클래스
- 문자열을 처리할 수 있는 class
- 문자열 값 수정 불가능, immutable(불변)
- 문자열 수정 시 수정된 문자열이 새로 할당되어 새 주소가 리턴 됨
- 문자열을 자주 수정할 경우 메모리 낭비가 심함(문자열 조작 작업에 부적합)
- 문자열 리터럴은 StringPool(문자열 저장소)에 객체 생성

## StringBuffer 클래스
- 문자열을 처리할 수 있는 class
- 문자열 값 수정 가능, mutable(가변)
- 기존 문자열에 수정되어 적용됨(추가,수정,삭제 등..)
- 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가 시킬 수 있음
- 문자열을 자주 변경해야 하는 경우 String보다 유용 함
- 쓰레드 safe 기능을 제공

## StringBuilder 클래스
- 문자열을 처리할 수 있는 class
- 문자열 값 수정 가능, mutable(가변)
- 기존 문자열에 수정되어 적용됨(추가,수정,삭제 등..)
- 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가 시킬 수 있음
- 문자열을 자주 변경해야 하는 경우 String보다 유용 함
- 쓰레드 safe 기능을 제공 안함

## StringTokenizer 클래스
- 객체 생성 시 전달받은 문자열을 지정한 구분자를 기준으로 나누어 저장해 줌
- 나누어진 문자열을 토큰(Token)이라고 부름
- String클래스에서 제공하는 split()메소드와 같은 기능을 하는 클래스
- 파일에 저장된 텍스트를 처리하는 경우에 유용하게 사용됨
- 메소드
	- countTokens() : 남아있는 토큰의 수를 반환
	- hasMoreTokens() : 남아있는 토큰이 있는지 확인(true,false 반환)
	- nextToken() : 토큰을 하나씩 꺼내옴
	
---

# Wrapper 클래스
- 기본 자료형을 객체화 시켜주는 클래스
- 기본 자료형 : boolean, byte, short, int, long, float, double, char
- 기본 자료형의 데이터를 포장하여 객체화 시킴

---

# 날짜 관련 클래스
- Date 클래스, Calendar 클래스
- JDK8 부터 제공되는 java.time 패키지에는 ZonedDateTime, LocalDateTime 등.. 더 개선된 날짜와 시간 관련 클래스 제공

## Date 클래스
- 시스템으로부터 현재 날짜, 시간정보를 가져와서 다룰 수 있게 만들어진 클래스
- 자바 버전업이 되면서 생성자 2개만 사용가능하고 나머지는 deprecated(비추천) 됨
- 일반적으로 Calendar 클래스 사용을 권장

### SimpleDateFormat 클래스
- Date의 날짜, 시간 정보를 원하는 format(형식)으로 출력하도록 기능 제공

## Calendar 클래스
- 날짜와 시간을 다루기 위한 추상 클래스
- Calendar.getInstance() 메소드를 이용하여 객체를 생성해야 함.
- 요일은 1번이 일요일부터 시작
- 월이 0부터 시작함 : ※월을 계산할 때는 +1 하여 계산해야 함


## 실습 문제(Test04.java)
Calendar클래스를 이용해서 D-DAY계산기를 만드세요.

실행 내용

```
D-Day [년도]입력 : 2018
D-Day [월]입력 : 3
D-Day [일]입력 : 1
오늘 날짜 : 2018년 2월 24일
D-Day 날짜 : 2018년 3월 1일
5일 남았습니다.

D-Day [년도] 입력 : 2018
D-Day [월] 입력 : 2
D-Day [일] 입력 : 1
오늘 날짜 : 2018년 2월 24일
D-Day 날짜 : 2018년 2월 1일
23일 지났습니다.

D-Day [년도] 입력 : 2018
D-Day [월] 입력 : 2
D-Day [일] 입력 : 24
오늘 날짜 : 2018년 2월 24일
D-Day 날짜 : 2018년 2월 24일
D-Day 입니다.
```

