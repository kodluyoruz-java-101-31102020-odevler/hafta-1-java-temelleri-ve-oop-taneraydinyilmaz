package questionFour;

public class Main {

	public static void main(String[] args) {

		//
//		Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
//		
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********

		for (int line = 1; line <= 10; line++) {
			for (int column = 0; column < line; column++)
				System.out.print("*");
			System.out.println();
		}

	}

}
