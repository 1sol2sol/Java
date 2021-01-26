package poly2.abst1;
//자식 클래스
public class GalaxyNote20 extends Phone{
	//상속받은 클래스에 추상 메소드가 있으면 반드시 오버라이딩을 해야한다 
	//- 안하면 컴파일 오류 발생 
	@Override
	public void camera() {
		System.out.println("100배 확대~");
	}
}
