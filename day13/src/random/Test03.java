package random;
//다음 랜덤값을 구하여 출력
//1. 로또번호 1개 
//2. 두 자리 정수 중 1개 
//3. 앞/뒤 중 1개 
public class Test03 {
public static void main(String[] args) {
	
	//로또번호 = 1부터 45개 
	int lotto = (int)(Math.random() * 45) + 1;
	System.out.println("로또번호 : " + lotto);
	
	//두 자리 정수 중 1개 = 10부터 90개 
	int decimal = (int)(Math.random() * 90) + 10;
	System.out.println("두자리정수 : " + decimal);
	
	// 앞/뒤 중 1개 
	// = ?부터 ?개 = 알 수 없으니 임의로 정함 = 0부터 2개 = 1부터 2개 = 200부터 2개 
	// 0이 나오면 앞이라고 가정
	// 1이 나오면 뒤라고 가정 
	int choice =(int)(Math.random() * 2); // 0부터 2개 +0은 써도 안써도 상관없으므로
	System.out.println("choice = " + choice);
	
//	if(choice == 0) {
//		System.out.println("앞");
//	}
//	else {
//		System.out.println("뒤");
//	}
	
	String[]str = new String[] {"앞", "뒤"};
	System.out.println(str[choice]);
}
}
