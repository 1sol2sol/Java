package file1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 파일 출력 : FileOutputStream
		// - 파일에 바이트 단위로 저장할 때 사용 
		// - 그림, 오디오, 비디오, 텍스트 파일 등... 모든 종류의 데이터를 파일로 저장 
		
		// 1. 파일을 지정해서 스트림을 연결 시켜 줌 
		// 파일이 없으면 새로 생성, 있으면 덮어쓰기 
		FileOutputStream fos = new FileOutputStream("resources\\test03.txt");
		
		//2. 파일에 작업
		// 바이트 기반으로 출력해야 하기 때문에 바이트타입의 데이터 전달
		fos.write("Hello".getBytes());
		fos.write("12345\n".getBytes());
		fos.write("Welcome".getBytes());
		
		// 3. 파일 스트림 닫기
		fos.close();
	}
}
