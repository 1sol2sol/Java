package file1;

import java.io.FileWriter;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) {
		// 파일 출력 2 : FileWriter(*****)
		// - 텍스트 파일로부터 문자 단위로 저장할 때 사용
		// - 텍스타가 아닌 그림,오디오,비디오 등의 파일은 저장 불가능
		// - 파일 이어쓰기를 할 경우 두번째 인자로 true 지정해줘야 함!!
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("resources\\test07.txt",true);
			fw.write("HIHI\n");
			fw.write("안녕하세요~!");
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}

}