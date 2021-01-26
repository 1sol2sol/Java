package poly1.basic2;

import java.util.Scanner;

public class Run {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Phone [] pList = new Phone[5];
	
	pList[0] = new GalaxyNote20("삼성", "SGN-01", "SKT", "01012345678", "블루");
	pList[1] = new GalaxyNote20("삼성", "SGN-02", "KT", "01011112222", "블랙");
	pList[2] = new Iphone12("애플", "AP12-01", "LGU", "01023234545", "화이트");
	pList[3] = new Iphone12("애플", "AP12-02", "KT", "01052524587", "블루");
	pList[4] = new GalaxyFold2("삼성", "SGP-01", "SKT", "01025874563", "골드");
	
	//printf - 서식에 맞게 출력 
	//서식제어문자 - %s:문자열, %d:10진 출력, %o:8진 정수형, %x:16진 정수형, %f:실수형, %c:단일문자형
	//System.out.printf("이름 : %s, 나이 : %d", "홍길동", 20);
	//Systme.out.printf("%d / %o / %x", 180, 180, 180);
	
	System.out.printf("%s	%s	%s	%s	%s		%s\n","번호","제조사","시리얼번호","통신사","전화번호","색상");

	for(int i=0; i<pList.length; i++) {
		System.out.printf("%d  %s  %s  %s  %s  %s\n", i+1,
				pList[i].getManufacture(),
				pList[i].getSerialNumber(),
				pList[i].getMobileCarrier(),
				pList[i].getPhoneNumber(),
				pList[i].getColor());
	}
	
	System.out.print("사용해 볼 휴대폰의 번호를 선택하세요 : ");
	int select = sc.nextInt();
	
	if(select>0 && select<=pList.length) {
		System.out.println("[ " + pList[select-1].getClass().getSimpleName()+" 휴대폰 ]");
	pList[select-1].call();
	pList[select-1].text();
	pList[select-1].photo();
	}
	if(pList[select-1] instanceof GalaxyNote20) {
	((GalaxyNote20)pList[select-1]).samsungpay();
	} else if(pList[select-1] instanceof GalaxyFold2){
		((GalaxyFold2)pList[select-1]).screenFold();
	} else if(pList[select-1] instanceof Iphone12) {
		((Iphone12)pList[select-1]).gesture();
	}
	sc.close();
	
	}
}

