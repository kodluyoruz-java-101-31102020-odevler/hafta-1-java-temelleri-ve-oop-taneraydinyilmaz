package questionOne;

import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);;

	public static void main(String[] args) {

//		  String tipinde sabit bir �ifre de�i�keni olu�turun.
//		  �rne�in: String password = "12345"; gibi.
//		  Ard�ndan, kullan�c�dan klavyeden bir �ifre girmesini isteyin.
//		  Girilen �ifre ile de�i�kende tuttu�unuz de�eri k�yaslay�n. 
//		  E�er, iki de�er birbirine e�itse ekrana "Giri� Ba�ar�l�!", de�ilse "Giri� Ba�ar�s�z" yazd�r�n.

		System.out.print("�ifrenizi girin: ");
		String inputPass = input.nextLine();

		PasswordCheck checkPass = new PasswordCheck();

		// PasswordCheck s�n�f�n�n setPassword fonksiyonuna de�eri yolluyoruz.
		checkPass.setPassword(inputPass);

		checkPass.message();

	}

}
