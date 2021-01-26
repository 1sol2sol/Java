package file1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		// 파일 입출력 예외처리 
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("resources\\test05.txt");
			fos.write("안녕하세요~!".getBytes());
			fos.write("하하하~!".getBytes());
			fos.write("호호호~!".getBytes());
			
		} catch (IOException e) {
			System.out.println("파일에 쓰기 실패~!");
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("파일 닫기 실패~!");
			}
		}

			
	}

}
