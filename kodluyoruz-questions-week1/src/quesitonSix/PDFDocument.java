package quesitonSix;

public class PDFDocument implements DocumentInterface{
	//
	// PDFDocument isminde bir s�n�f yarat�n.
	//s�n�f i�inde String body = ""; 
	//Tan�mlanan bu "body" isimli de�i�keninin tutaca�� veriyi kurucu metot vas�tas�yla g�nderin. 
	//S�n�f�n i�inde "body" de�i�kenine ait de�eri d��ar�ya d�nd�recek "getBody" isimli bir metot yaz�n.
	
	
	String body="";

	public PDFDocument(String body) { 
		this.body = body;
	}

	@Override
	public String getBody() { 
		
		return this.body;
	}
}
