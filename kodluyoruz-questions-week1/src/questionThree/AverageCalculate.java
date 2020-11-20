package questionThree;

import java.util.Random;

public class AverageCalculate {

	// uzunlu�u d��ar�dan verilen dizinin i�ine rastgele say�lar doldurulur.
	// bu fonksiyonda rastgele say�lar '0-57' aras�nda olu�turulur.
	public static int[] createArray(int arraySize) {

		Random random = new Random();

		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			int numbers = random.nextInt(57);
			array[i] = numbers;

			// dizi elemanlar�n� sonu� ekran�nda g�rmek i�in
			// System.out.println(array[i]);
		}
		return array;
	}

	// d��ar�dan ald��� dizinin elemanlar�n� toplar ve 'toplam eleman' say�s�na b�ler.
	public static double averageCalculate(int[] array) {
		double averages = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		averages = sum / array.length;
		return averages;
	}
}