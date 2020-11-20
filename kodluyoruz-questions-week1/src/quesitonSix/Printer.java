package quesitonSix;

public class Printer {
	//
	//Printer isminde bir sýnýf tanýmlayýn. 
	//"printPDFDocument" isminde PDF dokümanýna ait "body" bilgisini konsol ekrana yazdýran bir metot tanýmlayýn.
	//Ayný þekilde "printWordDocument" isminde Word dokümanýný konsol ekrana yazdýran bir metot tanýmlayýn. 
	//Bu metotlarý "static" tanýmlamanýz gerekmektedir.
	//Not: Print sýnýfý içinde niçin statik metot kullandýðýmýzý kýsaca açýklayýn.
	
	//Açýklama -->   	
	// Printer sýnýfýndaki metodu Main sýnýfýnda çaðýrmak istyorsak ve Printer nesnesi kullanmak istemiyorsak bu metod statik olmalýdýr.
	 
	 
	static void outPrint(DocumentInterface documentInterface) {
		System.out.println(documentInterface.getBody());
	}

}
