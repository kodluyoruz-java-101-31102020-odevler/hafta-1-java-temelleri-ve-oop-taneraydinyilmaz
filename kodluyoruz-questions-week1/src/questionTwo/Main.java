package questionTwo;

import java.util.Scanner;
 

public class Main {

	public static void main(String[] args) {
		
//		Kullan�c�n�n konsol ekrandan 4 temel matematiksel i�lemi yapabildi�i bir program yazman�z bekleniyor. 
//		Program a�a��daki �zellikleri sa�lamal�d�r.
//		-Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme
//		-Kullan�c�ya 4 i�lemden birini se�ece�i men�y� konsol ekrana yazd�r�n. �rne�in: 1-Toplama, 2-��karma vb...
//		-Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say� girmesini isteyin. Bu girilen iki say�y� de�i�kenlerde saklay�n.
//		-Se�ilen i�lem tipine g�re matematiksel i�lemi yap�n ve konsol ekran�na yazd�r�n.
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		System.out.println("1. Tam say�y� gir :");
		int first=scanner.nextInt();
		System.out.println("2. Tam Say�y� gir :");
		int second=scanner.nextInt();

		builder.append("+++++++++++++++++++++++++."); 
		builder.append("\n");
		builder.append("Toplama i�lemi i�in | + |");
		builder.append("\n");
		builder.append("��karma i�lemi i�in | - |");
		builder.append("\n");
		builder.append("B�lme i�lemi i�in   | / |");
		builder.append("\n");
		builder.append("�arpma i�lemi i�in  | * |");
		builder.append("\n");
		builder.append("+++++++++++++++++++++++++");
		builder.append("\n");
		builder.append("��lem tipini se�iniz: "); 
		System.out.println(builder);
		char operation=scanner.next().charAt(0);
		
		Calculator calculator = new Calculator();
		
		//Calculator s�n�f�n�n 'result' fonksiyonuna bir adet char, iki adet int tipinde de�er g�nderiyoruz.
		calculator.result(operation, first, second);
		
		scanner.close();
		 
	}
} 