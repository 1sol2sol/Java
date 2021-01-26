package file1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// 파일 출력 -  파일 이어쓰기
		// -> 파일 이어쓰기 하고 싶은 경우 인자값으로 true 추가 
		FileOutputStream fos = new FileOutputStream("resources\\test03.txt",true);
		
		fos.write("안녕하세요".getBytes());
		
		fos.close();
	}

}
