package questionOne;

import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);;

	public static void main(String[] args) {

//		  String tipinde sabit bir þifre deðiþkeni oluþturun.
//		  Örneðin: String password = "12345"; gibi.
//		  Ardýndan, kullanýcýdan klavyeden bir þifre girmesini isteyin.
//		  Girilen þifre ile deðiþkende tuttuðunuz deðeri kýyaslayýn. 
//		  Eðer, iki deðer birbirine eþitse ekrana "Giriþ Baþarýlý!", deðilse "Giriþ Baþarýsýz" yazdýrýn.

		System.out.print("Þifrenizi girin: ");
		String inputPass = input.nextLine();

		PasswordCheck checkPass = new PasswordCheck();

		// PasswordCheck sýnýfýnýn setPassword fonksiyonuna deðeri yolluyoruz.
		checkPass.setPassword(inputPass);

		checkPass.message();

	}

}
