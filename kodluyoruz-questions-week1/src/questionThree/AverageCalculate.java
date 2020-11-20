package questionThree;

import java.util.Random;

public class AverageCalculate {

	// uzunluðu dýþarýdan verilen dizinin içine rastgele sayýlar doldurulur.
	// bu fonksiyonda rastgele sayýlar '0-57' arasýnda oluþturulur.
	public static int[] createArray(int arraySize) {

		Random random = new Random();

		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			int numbers = random.nextInt(57);
			array[i] = numbers;

			// dizi elemanlarýný sonuç ekranýnda görmek için
			// System.out.println(array[i]);
		}
		return array;
	}

	// dýþarýdan aldýðý dizinin elemanlarýný toplar ve 'toplam eleman' sayýsýna böler.
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