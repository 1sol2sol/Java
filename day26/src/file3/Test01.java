package file3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 파일 입출력 스트림 참조변수 생성
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			File file = new File("resources\\exam01.txt");
			fos = new FileOutputStream(file); // true가 없다면 전에 저장된 내용은 사라짐

			// 사용자에게 입력받은 문자열 파일에 쓰기
			while (true) {
				System.out.print("문자열을 입력하세요.(exit 입력시 프로그램 종료) : ");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					break;
				}
				fos.write(str.getBytes());
				fos.write("\n".getBytes()); // 문자열 하나 입력후 다음줄에 입력하기 위해 -> enter의 역할
			}
			// 파일에 저장된 내용 불러와서 출력하기
			fis = new FileInputStream(file);
			byte[] buffer = new byte[(int) file.length()];
			fis.read(buffer);
			System.out.write(buffer);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
