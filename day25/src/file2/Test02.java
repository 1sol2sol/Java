package file2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		// 성능향상 보조 스트림 (*********)
		
		BufferedWriter bw = null;
		try {
			// 주 스트림 생성 후 보조 스트림 객체 생성하면서 주 스트림과 연결 
			bw = new BufferedWriter(new FileWriter("resources\\test12.txt",true));
			bw.write("Hello");
			bw.write("hihi");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
