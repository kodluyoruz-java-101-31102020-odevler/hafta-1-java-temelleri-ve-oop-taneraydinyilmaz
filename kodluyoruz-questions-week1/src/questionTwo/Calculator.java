package questionTwo;

public class Calculator {

	//private hesaplamalar
	
	//first ve second parametresini toplar ve sonucu döndürür.
	private int addition(int first, int second) {
		int result = first + second;
		return result;

	}

	//first ve second parametresini çýkarýr ve sonucu döndürür.
	private int extraction(int first, int second) {
		int result = first - second;
		return result;

	}

	//first ve second parametresini böler ve sonucu döndürür.
	private double division(int first, int second) {
		int result = first / second;
		return  result;

	}

	//first ve second parametresini çarpar ve sonucu döndürür.
	private int multiplication(int first, int second) {
		int result = first * second;
		return result;

	}

	//dýþarýdan gelen veri tiplerini fonksiyonun içerisindeki, private fonksiyonlarda kullanýyoruz.
	//aslýnda buradaki amaç, içerideki iþlemi dýþarýya göstermemek.
	public void result(char operations, int first, int second) {

		switch (operations) {
		case '+': 
			System.out.println("Toplama iþleminin sonucu: " + addition(first, second));
			break;
		case '-': 
			System.out.println("Çýkarma iþleminin sonucu: " + extraction(first, second));
			break;
		case '/': 
			System.out.println("Bölme iþleminin sonucu: " + division(first, second));
			break;
		case '*': 
			System.out.println("Çarpma iþleminin sonucu: " + multiplication(first, second));
			break;

		default:
			System.out.println("Geçersiz karakter kullanýldý !");
			break;
		}
	}

	
}
