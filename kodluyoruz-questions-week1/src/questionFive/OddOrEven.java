package questionFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddOrEven {

	private static List<Integer> doubleArray = new ArrayList<Integer>();
	private static List<Integer> singleArray = new ArrayList<Integer>();

	
	//dýþarýdan gelen arraySize deðeri aslýnda dizinin boyutudur.
	//fonksiyon içerisinde 0-900 arasýnda dizi büyüklüðü kadar rastgele sayý üretir.
	//üretilen sayýlar tek çift kontrolünden(checkNumber) geçtikten sonra doubleArray ve singleArray olmak üzere iki ayrý List'e aktarýlýr.
	
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

	//sayýlarýn tek çift kontrolü yapýlýr.
	private static boolean checkNumber(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	//Listlere aktarýlan deðerler burda ekrana yazdýrýlýr.
	public static void result() {
		System.out.println("-- | Çift Sayýlar || " + doubleArray);
		System.out.println("-- | Tek Sayýlar  || " + singleArray);
	}

}
