package questionTwo;

public class Calculator {

	//private hesaplamalar
	
	//first ve second parametresini toplar ve sonucu d�nd�r�r.
	private int addition(int first, int second) {
		int result = first + second;
		return result;

	}

	//first ve second parametresini ��kar�r ve sonucu d�nd�r�r.
	private int extraction(int first, int second) {
		int result = first - second;
		return result;

	}

	//first ve second parametresini b�ler ve sonucu d�nd�r�r.
	private double division(int first, int second) {
		int result = first / second;
		return  result;

	}

	//first ve second parametresini �arpar ve sonucu d�nd�r�r.
	private int multiplication(int first, int second) {
		int result = first * second;
		return result;

	}

	//d��ar�dan gelen veri tiplerini fonksiyonun i�erisindeki, private fonksiyonlarda kullan�yoruz.
	//asl�nda buradaki ama�, i�erideki i�lemi d��ar�ya g�stermemek.
	public void result(char operations, int first, int second) {

		switch (operations) {
		case '+': 
			System.out.println("Toplama i�leminin sonucu: " + addition(first, second));
			break;
		case '-': 
			System.out.println("��karma i�leminin sonucu: " + extraction(first, second));
			break;
		case '/': 
			System.out.println("B�lme i�leminin sonucu: " + division(first, second));
			break;
		case '*': 
			System.out.println("�arpma i�leminin sonucu: " + multiplication(first, second));
			break;

		default:
			System.out.println("Ge�ersiz karakter kullan�ld� !");
			break;
		}
	}

	
}
