package questionThree;

public class Main {

	public static void main(String[] args) {

//		Rastgele say�lardan olu�mu� 100 elemanl�k tamsay� dizisindeki t�m elemanlar�n ortalamas�n� alacak program� geli�tirin.
//		Program� yazarken a�a��daki �zelliklere uygun yaz�n�z.
//		-Rastgele olu�an 10 elemanl�k say� k�mesi program yeniden her �al��t���nda de�i�sin. Sabit elemanl� bir dizi vermeyin!
//		-Ortalama almay� sa�layacak kodu bir fonksiyon halinde tasarlay�n. ��ine diziyi girdi (input) olarak als�n.
//		-Ortalama alan fonksiyon ortalamay� ondal�kl� say� olarak d�nd�rs�n. (return) etsin.

		int[] array = AverageCalculate.createArray(100); // 100 elemanl�k tamsay� dizisi

		System.out.println(array.length + " elamanl� dizinin elemanlar�n�n ortalamas�: "
				+ AverageCalculate.averageCalculate(array));

	}
	
	

}
