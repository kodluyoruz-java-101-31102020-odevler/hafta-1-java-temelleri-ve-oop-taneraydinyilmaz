package quesitonSix;

public class PDFDocument implements DocumentInterface{
	//
	// PDFDocument isminde bir sýnýf yaratýn.
	//sýnýf içinde String body = ""; 
	//Tanýmlanan bu "body" isimli deðiþkeninin tutacaðý veriyi kurucu metot vasýtasýyla gönderin. 
	//Sýnýfýn içinde "body" deðiþkenine ait deðeri dýþarýya döndürecek "getBody" isimli bir metot yazýn.
	
	
	String body="";

	public PDFDocument(String body) { 
		this.body = body;
	}

	@Override
	public String getBody() { 
		
		return this.body;
	}
}
