package file1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) throws IOException {
		//  파일 입력 : FileInputStream
		// - 파일로부터 바이트 단위로 읽을 때 사용
		// - 그림,오디오,비디오,텍스트파일 등... 모든 종류의 파일 읽기 가능
		
		// 1. 읽어올 파일을 지정하여 스트림을 만들어서 연결시켜줌
		
		FileInputStream fis = new FileInputStream("resources\\test03.txt");
		
//		File file = new File("resources\\test03.txt");
//		FileInputStream fis2 = new FileInputStream(file);
		
		// 2. 읽기 작업
		// - .read() : 1바이트를 읽어서 읽은 바이트를 리턴해줌 
		System.out.println(fis.read()); // 72 - H의 아스키 코드값
		
		// 두번째 읽을 값 리턴 -> char형으로 강제 형변환을 해서 문자로 표현 
		System.out.println((char)fis.read()); // e
		
		// 한번에 데이터를 읽어오기 위한 버퍼를 만들어서 읽어오기 가능 
		
		// - 읽어온 내용을 저장할 배열 
		byte[] buffer = new byte[1024];
		//byte [] buffer = new byte[(int)file.length()];
		
		// - 입력 스트림에 남은 내용을 버퍼 크기만큼 읽어와서 저장 
		fis.read(buffer);
		
		// - 버퍼 내용 확인1 : 반목문 사용
		for(int i=0; buffer[i] != 0; i++) {
			System.out.print((char)buffer[i]); 
		}
		System.out.println();
		
		// - 버퍼 내용 확인2 : .write 메소드 사용 
		System.out.write(buffer); // 버퍼에 있는 전체 내용을 형식에 맞게 출력 
		System.out.println();
		
		// - 버퍼 내용 확인3 : 
//		int i = 0;
//		for(; buffer[i] != 0; i++);
//		byte [] buffer2 = new byte[i];
//		for(int j=0; j<i; j++) {
//			buffer2[j] = buffer[j];
//		}
//		System.out.println(buffer2);
		
		// 3. 파일 스트림 닫기 
		fis.close();
		
	}
}
