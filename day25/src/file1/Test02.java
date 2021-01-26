package file1;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
		// 기존 파일 확인하기 
		File file = new File("resources\\입출력설명.png");
		
		if(file.exists()){
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일상대경로 : " + file.getPath());
			System.out.println("파일절대경로 : " + file.getAbsolutePath());
			System.out.println("파일크기 : " + file.length());
		}
		
	}

}
