package quesitonSix;

public class Main {
	//
	/*
	 * sorunun tamamý: PDFDocument isminde bir sýnýf yaratýn. Ardýndan, WordDocument
	 * isminde bir sýnýf tasarlayýn. Bu iki sýnýf içinde String body = ""; isminde
	 * bir tane nesne deðiþkeni tanýmlayýn. Tanýmlanan bu "body" isimli deðiþkeninin
	 * tutacaðý veriyi kurucu metot vasýtasýyla gönderin. Sýnýfýn içinde "body"
	 * deðiþkenine ait deðeri dýþarýya döndürecek "getBody" isimli bir metot yazýn.
	 * 
	 * Yukarýdaki iþlemlerin ardýndan Printer isminde bir sýnýf tanýmlayýn.
	 * "printPDFDocument" isminde PDF dokümanýna ait "body" bilgisini konsol ekrana
	 * yazdýran bir metot tanýmlayýn. Ayný þekilde "printWordDocument" isminde Word
	 * dokümanýný konsol ekrana yazdýran bir metot tanýmlayýn. Bu metotlarý "static"
	 * tanýmlamanýz gerekmektedir.
	 * 
	 * Ardýndan main fonksiyonu içinde PDFDocument ve WordDocument nesneleri
	 * oluþturun. Bu nesnelere ait body bilgisini ekrana yazdýrmak için "Printer"
	 * sýnýfýnýn metotlarýný kullanýn.
	 * 
	 * Not: Print sýnýfý içinde niçin statik metot kullandýðýmýzý kýsaca açýklayýn.
	 * 
	 */
	public static void main(String[] args) {

		// Main fonksiyonu içinde PDFDocument ve WordDocument nesneleri oluþturun.
		// Bu nesnelere ait body bilgisini ekrana yazdýrmak için "Printer" sýnýfýnýn
		// metotlarýný kullanýn.
		Printer.outPrint(new PDFDocument("We are in the PDFDocument class"));
		Printer.outPrint(new WordDocument("We are in the WordDocument class"));
	}

}
