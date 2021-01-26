package file1;

import java.io.File;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		// 파일 생성하기(File 클래스 사용)
		// - 프로젝트 내 resources 폴더 하나 생성하기 
		
		//File file = new File("C:\\iotest\\test01.txt"); // 절대 경로
		File file = new File("resources\\test01.txt"); // 상대 경로
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("새로운 파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일이 생성되지 않았습니다.");
			}
		}
		System.out.println("파일명 : " + file.getName());
		System.out.println("파일경로(상대) : " + file.getPath());
		System.out.println("파일경로(절대) : " + file.getAbsolutePath());
		System.out.println("파일크기 : " + file.length());
		
	}

}
