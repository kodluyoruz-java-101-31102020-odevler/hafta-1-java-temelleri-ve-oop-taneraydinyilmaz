package questionFour;

public class Main {

	public static void main(String[] args) {

//		Aþaðýdaki görüntüyü konsol ekranýna yazdýran algoritmayý tasarlayýnýz.
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
