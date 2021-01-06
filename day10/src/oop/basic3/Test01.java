package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		
		//객체 생성
		ProductInfo a = new ProductInfo();
		ProductInfo b = new ProductInfo();
		ProductInfo c = new ProductInfo();
		
		//생성 초기화
		a.productCode = "A00001";
		a.name = "참이슬";
		a.category = "주류";
		a.price = 1200;
		
		b.productCode = "A00002";
		b.name = "처음처럼";
		b.category = "주류";
		b.price = 1300;
		
		c.productCode = "B00001";
		c.name = "고무장갑";
		c.category = "생필품";
		c.price = 2000;
		//출력 
		System.out.print(a.productCode+"\t");
		System.out.print(a.name+"\t");
		System.out.print(a.category+"\t");
		System.out.print(a.price+"\t");
		System.out.println();
		
		System.out.print(b.productCode+"\t");
		System.out.print(b.name+"\t");
		System.out.print(b.category+"\t");
		System.out.print(b.price+"\t");
		System.out.println();
		
		System.out.print(c.productCode+"\t");
		System.out.print(c.name+"\t");
		System.out.print(c.category+"\t");
		System.out.print(c.price+"\t");
		System.out.println();
	}
}
