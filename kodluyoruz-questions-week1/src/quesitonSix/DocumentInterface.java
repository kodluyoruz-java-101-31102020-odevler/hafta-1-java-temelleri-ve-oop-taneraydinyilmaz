package quesitonSix;

public interface DocumentInterface {

	
	//Ayn� fonksiyonu kullanan iki s�n�f�n �zelli�ini burada tan�mlad�m.
	//ve o s�n�flarda bu fonksiyonu ezdim(Override).
	
	/*
	*Neden b�yle bir interface tan�mlama amac� duydum:
	*PDF ve WORD document s�n�flar�nda getBody fonksiyonu kullan�lmas� istendi.
	*Ek olarak Printer s�n�f� di�er PDF ve WORD s�n�f� ile bir araya gelece�i i�in, Printer s�n�f�nda iki adet fonksiyon tan�mlamak yerine bir adet
	*DocumentInterface'den nesne �retip PDF ve WORD s�n�f�n�n i�ini ayn� anda g�rebilirim.
	*/
	public String getBody();
}
