package file2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 객체 파일로 출력 
		// - 보조 스트림 : ObjectOutputStream
		// - 출력할 객체에 Serializable 구현을 반드시 해야함!!
		
		// 객체 생성 및 데이터 입력 
		Student st = new Student("홍길동",20,"01011112222");
		// 입력된 내용 화면에 출력
		System.out.println(st);
			
		// 객체 데이터를 파일에 출력 
		
		// - 파일 출력 기반 스트림 객체 생성 
		FileOutputStream fos = new FileOutputStream("resources\\student.txt");
		
		// - 객체 출력 보조 스트림 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// - 보조 스트림을 이용해서 객체를 파일에 쓰기 
		oos.writeObject(st);
		
		System.out.println("--- 저장완료 ---");
		
		// 스트림 닫기
		oos.close();
		fos.close();
		
		
	}
}
