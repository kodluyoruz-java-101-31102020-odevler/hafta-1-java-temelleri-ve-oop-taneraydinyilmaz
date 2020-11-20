package quesitonSix;

public interface DocumentInterface {

	
	//Ayný fonksiyonu kullanan iki sýnýfýn özelliðini burada tanýmladým.
	//ve o sýnýflarda bu fonksiyonu ezdim(Override).
	
	/*
	*Neden böyle bir interface tanýmlama amacý duydum:
	*PDF ve WORD document sýnýflarýnda getBody fonksiyonu kullanýlmasý istendi.
	*Ek olarak Printer sýnýfý diðer PDF ve WORD sýnýfý ile bir araya geleceði için, Printer sýnýfýnda iki adet fonksiyon tanýmlamak yerine bir adet
	*DocumentInterface'den nesne üretip PDF ve WORD sýnýfýnýn iþini ayný anda görebilirim.
	*/
	public String getBody();
}
