package questionThree;

public class Main {

	public static void main(String[] args) {

//		Rastgele sayýlardan oluþmuþ 100 elemanlýk tamsayý dizisindeki tüm elemanlarýn ortalamasýný alacak programý geliþtirin.
//		Programý yazarken aþaðýdaki özelliklere uygun yazýnýz.
//		-Rastgele oluþan 10 elemanlýk sayý kümesi program yeniden her çalýþtýðýnda deðiþsin. Sabit elemanlý bir dizi vermeyin!
//		-Ortalama almayý saðlayacak kodu bir fonksiyon halinde tasarlayýn. Ýçine diziyi girdi (input) olarak alsýn.
//		-Ortalama alan fonksiyon ortalamayý ondalýklý sayý olarak döndürsün. (return) etsin.

		int[] array = AverageCalculate.createArray(100); // 100 elemanlýk tamsayý dizisi

		System.out.println(array.length + " elamanlý dizinin elemanlarýnýn ortalamasý: "
				+ AverageCalculate.averageCalculate(array));

	}
	
	

}
