package quesitonSix;

public class Printer {
	//
	//Printer isminde bir s�n�f tan�mlay�n. 
	//"printPDFDocument" isminde PDF dok�man�na ait "body" bilgisini konsol ekrana yazd�ran bir metot tan�mlay�n.
	//Ayn� �ekilde "printWordDocument" isminde Word dok�man�n� konsol ekrana yazd�ran bir metot tan�mlay�n. 
	//Bu metotlar� "static" tan�mlaman�z gerekmektedir.
	//Not: Print s�n�f� i�inde ni�in statik metot kulland���m�z� k�saca a��klay�n.
	
	//A��klama -->   	
	// Printer s�n�f�ndaki metodu Main s�n�f�nda �a��rmak istyorsak ve Printer nesnesi kullanmak istemiyorsak bu metod statik olmal�d�r.
	 
	 
	static void outPrint(DocumentInterface documentInterface) {
		System.out.println(documentInterface.getBody());
	}

}
