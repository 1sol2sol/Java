package poly3.inter2;
// 자식 클래스
public class Lamborghini extends Car implements Navigation, Sunroof, Radio {
	
	@Override
	public void channelChange() {
		System.out.println("라디오 채널을 변경합니다~");
	}

	@Override
	public void listenRadio() {
		System.out.println("라디오 듣기를 시작합니다~");
	}

	@Override
	public void sunroofOpen() {
		System.out.println("선루프 열기가 작동합니다~");
	}

	@Override
	public void sunroofClose() {
		System.out.println("선루프를 닫습니다~");
	}

	@Override
	public void destination() {
		System.out.println("네비게이션 목적지를 입력하세요~");
	}

	@Override
	public void directions() {
		System.out.println("목적지까지 길 안내를 시작합니다~");
	}
}
