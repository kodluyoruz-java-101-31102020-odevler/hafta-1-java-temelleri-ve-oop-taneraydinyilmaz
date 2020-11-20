package questionOne;

public class PasswordCheck {

	private static final String PASS = "12345";
	private String password;

	//(priv)password'un i�erisinin bo� olup olmad���n�  kontrol eder.
	private boolean blankPasswordCheck() {
		if (password.isEmpty() || password == null || "".equals(password) || " ".equals(password))
			return false;
		return true;
	}

	//(priv)password'un PASS de�i�keni ile e�itli�inin kontrol� yap�l�r.
	private boolean PasswordValidator() {
		if (password.equals(PASS)) {
			return true;
		} else {
			return false;
		}
	}

	//d��ar�dan �ifreyi al�r ve bu s�n�fdaki private olan password de�i�kenine atama yapar.
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 blankPasswordCheck fonksiyonu ile PasswordValidator fonksiyonundan -
	d�nen boolean(true-false) sonucuna g�re ekrana ��kt� g�nderir.
	*/
	public void message() {
		if (blankPasswordCheck() == true) {
			if (PasswordValidator() == true)
				System.out.println("Giri� Ba�ar�l�");
			else
				System.out.println("Giri� Ba�ar�s�z");
		} else
			System.out.println("�ifre girilmeden devam edilemez !");
	}
	
}
