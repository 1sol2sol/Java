package oop.basic3;

public class Test02 {
	public static void main(String[] args) {
//	객체가 3개니까 여러개라고 생각하고 배열로 구현?
//	int[]arr = new int[3];
		ProductInfo[] list = new ProductInfo[3];

		list[0] = new ProductInfo();
		list[1] = new ProductInfo();
		list[2] = new ProductInfo();

		list[0].productCode = "A00001";
		list[0].name = "참이슬";
		list[0].category = "주류";
		list[0].price = 1200;

		list[1].productCode = "A00002";
		list[1].name = "처음처럼";
		list[1].category = "주류";
		list[1].price = 1300;

		list[2].productCode = "B00001";
		list[2].name = "고무장갑";
		list[2].category = "생필품";
		list[2].price = 2000;

		System.out.print(list[0].productCode + "\t");
		System.out.print(list[0].name + "\t");
		System.out.print(list[0].category + "\t");
		System.out.print(list[0].price + "\t");
		System.out.println();

		System.out.print(list[1].productCode + "\t");
		System.out.print(list[1].name + "\t");
		System.out.print(list[1].category + "\t");
		System.out.print(list[1].price + "\t");
		System.out.println();

		System.out.print(list[2].productCode + "\t");
		System.out.print(list[2].name + "\t");
		System.out.print(list[2].category + "\t");
		System.out.print(list[2].price + "\t");
		System.out.println();

	}
}
