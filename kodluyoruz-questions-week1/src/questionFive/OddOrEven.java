package questionFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddOrEven {

	private static List<Integer> doubleArray = new ArrayList<Integer>();
	private static List<Integer> singleArray = new ArrayList<Integer>();

	
	//d��ar�dan gelen arraySize de�eri asl�nda dizinin boyutudur.
	//fonksiyon i�erisinde 0-900 aras�nda dizi b�y�kl��� kadar rastgele say� �retir.
	//�retilen say�lar tek �ift kontrol�nden(checkNumber) ge�tikten sonra doubleArray ve singleArray olmak �zere iki ayr� List'e aktar�l�r.
	
	public static int[] createArray(int arraySize) {
		Random randomNumber = new Random();
		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt(900);
			if (checkNumber(array[i]) == true) {
				doubleArray.add(array[i]);
			} else {
				singleArray.add(array[i]);
			}
		}
		return array;
	}

	//say�lar�n tek �ift kontrol� yap�l�r.
	private static boolean checkNumber(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	//Listlere aktar�lan de�erler burda ekrana yazd�r�l�r.
	public static void result() {
		System.out.println("-- | �ift Say�lar || " + doubleArray);
		System.out.println("-- | Tek Say�lar  || " + singleArray);
	}

}
