# GUI(Graphic User Interface)
- 사용자가 편리하게 사용할 수 있도록 그래픽으로 사용환경을 제공해 주는 것
- 윈도우 창, 아이콘 등...

## GUI 프로그래밍 관련 용어
- 컴포넌트(Component)
	- 사전적의미 : 구성요소로서 독립적인 기능을 수행하는 모듈 또는 부품
	- GUI에서 창에 보여질 각각의 아이템들
	- 컨테이너를 제외한 나머지 컴포넌트들은 컨테이너에 포함되어야 화면에 출력 될 수 있음
- 컨테이너(Container)
	- 다른 컴포넌트들을 포함할 수 있는 컴포넌트
	- 다른 컨테이너에 포함 될 수도 있고, 독립적으로 존재하는 것도 가능
	
## 자바 GUI 프로그래밍
- AWT -> Swing -> JavaFX
- AWT
	- GUI를 위한 라이브러리 모음
	- 운영체제가 제공하는 자원을 이용해서 컴포넌트를 생성함
	- 장점 : 여러 플랫폼에서 쉽게 컴포넌트를 제공할 수 있음
	- 단점 : 컴포넌트가 종속적이기 때문에 실행되는 플랫폼에 따라서 컴포넌트의 모습이 달라질 수 있음(일관된 화면 제공이 어려움)
- Swing(스윙)
	- AWT의 단점을 보완해서 추가된 패키지
	- 컴포넌트가 자바로 작성되어 있기 때문에 어떤 플랫폼에서도 일관된 화면을 보여줄 수 있음
	- AWT에는 없는 다양한 컴포넌트들이 제공
	- AWT 컴포넌트 이름 앞에 J를 붙인 동일한 기능을 하는 컴포넌트들을 대체용으로 제공

# GUI 프로그래밍 순서
1. 컨테이너 객체 생성 
2. 컨테이너에 레이아웃 설정
3. 컴포넌트 객체 생성 
4. 컴포넌트를 컨테이너에 배치 
5. 컴포넌트에 이벤트 처리

## 1. 컨테이너 객체 생성
- 종류 : JFrame(가장 기본), JWindow, JDialog, JPanel 클래스 등... 
- 컨테이너 객체 생성 방법
	1. 컨테이너 객체를 직접 생성하는 방법
	2. 컨테이너 클래스를 상속받아서 생성하는 방법
	
## 2. 컨테이너에 레이아웃 설정
- 컨테이너 배치 방식 설정
- Layout 클래스에 대한 객체를 생성해서 컨테이너에 설정 
- 레이아웃 클래스 
	- BorderLayout : 화면을 모두 5개 영역(동/서/남/북/가운데)으로 나누어서 구분
					 각 영역에 1개의 컴포넌트를 배치(Panel을 이용해 여러 컴포넌트 배치 가능)
	- FlowLayout : 워드프로세스와 같은 방식으로 배치, 3가지 정렬방식(왼쪽/가운데/오른쪽), 순서대로 배치되는 구조
	- GridLayout : 가로/세로 일정 수 만큼 배치, 격자 구조 
	- GridBagLayout : 위치와 크기를 자유롭게 배치, 엑셀처럼 셀을 병합해서 사용자가 원하는 스타일로 지정 가능, 설정이 좀 복잡하다 
	- CardLayout : 여러 컨테이너를 슬라이드처럼 바꿔가며 보여줄 수 있음, 페이지 전환 - 이벤트 처리방법을 알아야 사용 가능 
- 컨테이너레퍼런스.setLayout(레이아웃객체);
- 레이아웃설정을 null로 하고, 각 컴포넌트의 위치와 크기를 이용해서 배치할 수도 있음 
	
