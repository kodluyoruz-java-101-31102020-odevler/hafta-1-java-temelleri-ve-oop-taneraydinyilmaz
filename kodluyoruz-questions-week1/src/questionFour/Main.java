package questionFour;

public class Main {

	public static void main(String[] args) {

//		A�a��daki g�r�nt�y� konsol ekran�na yazd�ran algoritmay� tasarlay�n�z.
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
