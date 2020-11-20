package quesitonSix;

public class Main {
	//
	/*
	 * sorunun tamam�: PDFDocument isminde bir s�n�f yarat�n. Ard�ndan, WordDocument
	 * isminde bir s�n�f tasarlay�n. Bu iki s�n�f i�inde String body = ""; isminde
	 * bir tane nesne de�i�keni tan�mlay�n. Tan�mlanan bu "body" isimli de�i�keninin
	 * tutaca�� veriyi kurucu metot vas�tas�yla g�nderin. S�n�f�n i�inde "body"
	 * de�i�kenine ait de�eri d��ar�ya d�nd�recek "getBody" isimli bir metot yaz�n.
	 * 
	 * Yukar�daki i�lemlerin ard�ndan Printer isminde bir s�n�f tan�mlay�n.
	 * "printPDFDocument" isminde PDF dok�man�na ait "body" bilgisini konsol ekrana
	 * yazd�ran bir metot tan�mlay�n. Ayn� �ekilde "printWordDocument" isminde Word
	 * dok�man�n� konsol ekrana yazd�ran bir metot tan�mlay�n. Bu metotlar� "static"
	 * tan�mlaman�z gerekmektedir.
	 * 
	 * Ard�ndan main fonksiyonu i�inde PDFDocument ve WordDocument nesneleri
	 * olu�turun. Bu nesnelere ait body bilgisini ekrana yazd�rmak i�in "Printer"
	 * s�n�f�n�n metotlar�n� kullan�n.
	 * 
	 * Not: Print s�n�f� i�inde ni�in statik metot kulland���m�z� k�saca a��klay�n.
	 * 
	 */
	public static void main(String[] args) {

		// Main fonksiyonu i�inde PDFDocument ve WordDocument nesneleri olu�turun.
		// Bu nesnelere ait body bilgisini ekrana yazd�rmak i�in "Printer" s�n�f�n�n
		// metotlar�n� kullan�n.
		Printer.outPrint(new PDFDocument("We are in the PDFDocument class"));
		Printer.outPrint(new WordDocument("We are in the WordDocument class"));
	}

}
