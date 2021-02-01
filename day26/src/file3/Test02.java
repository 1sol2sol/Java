package file3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("resources\\exam01.txt");
		
		// 파일 입력 스트림 객체 
		FileInputStream fis = new FileInputStream(file);
		// 파일 출력 스트림 객체
		FileOutputStream fos = new FileOutputStream("resources\\copy_exam01.txt");
		
		System.out.println(file.length());
		// 파일 내용 저장할 임시 버퍼 생성 
		byte[] buffer = new byte[100];
		while(true) {
			int result = fis.read(buffer);
			System.out.println("읽어온 결과 : " + result);
			System.out.println(fis.available()+"/"+file.length());
			// fis.available() : 파일에서 읽어올 데이터가 얼마나 남았는지를 반환 
			// file.length() : 파일의 전체 크기 
			if(result == -1) {
				break;
			} 
			if(result >= buffer.length) { // 가져온 데이터가 버퍼보다 크거나 같으면
				// 읽어온(버퍼에 저장된) 데이터 전체 파일에 쓰기 
			fos.write(buffer);
			} else { // 읽어온 데이터가 버퍼크기보다 작으면 읽어온만큼만 파일에 쓰기 
				fos.write(buffer, 0, result); // (데이터가 저장된 byte배열, 시작인덱스, 크기)
			}
			//Thread.sleep(500); 
			// 프로그램 결과를 천천히 읽어올 수 있게 해주는 메소드 밀리초 1초를 1000이라고 생각함 
			// 0.5초씩 느리게 읽어오고 싶으면 1000*0.5 = 500
			
		}

		
		
	}
}
