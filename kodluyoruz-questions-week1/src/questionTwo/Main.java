package questionTwo;

import java.util.Scanner;
 

public class Main {

	public static void main(String[] args) {
		
//		Kullanýcýnýn konsol ekrandan 4 temel matematiksel iþlemi yapabildiði bir program yazmanýz bekleniyor. 
//		Program aþaðýdaki özellikleri saðlamalýdýr.
//		-Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme
//		-Kullanýcýya 4 iþlemden birini seçeceði menüyü konsol ekrana yazdýrýn. Örneðin: 1-Toplama, 2-Çýkarma vb...
//		-Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý girmesini isteyin. Bu girilen iki sayýyý deðiþkenlerde saklayýn.
//		-Seçilen iþlem tipine göre matematiksel iþlemi yapýn ve konsol ekranýna yazdýrýn.
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		System.out.println("1. Tam sayýyý gir :");
		int first=scanner.nextInt();
		System.out.println("2. Tam Sayýyý gir :");
		int second=scanner.nextInt();

		builder.append("+++++++++++++++++++++++++."); 
		builder.append("\n");
		builder.append("Toplama iþlemi için | + |");
		builder.append("\n");
		builder.append("Çýkarma iþlemi için | - |");
		builder.append("\n");
		builder.append("Bölme iþlemi için   | / |");
		builder.append("\n");
		builder.append("Çarpma iþlemi için  | * |");
		builder.append("\n");
		builder.append("+++++++++++++++++++++++++");
		builder.append("\n");
		builder.append("Ýþlem tipini seçiniz: "); 
		System.out.println(builder);
		char operation=scanner.next().charAt(0);
		
		Calculator calculator = new Calculator();
		
		//Calculator sýnýfýnýn 'result' fonksiyonuna bir adet char, iki adet int tipinde deðer gönderiyoruz.
		calculator.result(operation, first, second);
		
		scanner.close();
		 
	}
} 