package questionOne;

public class PasswordCheck {

	private static final String PASS = "12345";
	private String password;

	//(priv)password'un içerisinin boþ olup olmadýðýný  kontrol eder.
	private boolean blankPasswordCheck() {
		if (password.isEmpty() || password == null || "".equals(password) || " ".equals(password))
			return false;
		return true;
	}

	//(priv)password'un PASS deðiþkeni ile eþitliðinin kontrolü yapýlýr.
	private boolean PasswordValidator() {
		if (password.equals(PASS)) {
			return true;
		} else {
			return false;
		}
	}

	//dýþarýdan þifreyi alýr ve bu sýnýfdaki private olan password deðiþkenine atama yapar.
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 blankPasswordCheck fonksiyonu ile PasswordValidator fonksiyonundan -
	dönen boolean(true-false) sonucuna göre ekrana çýktý gönderir.
	*/
	public void message() {
		if (blankPasswordCheck() == true) {
			if (PasswordValidator() == true)
				System.out.println("Giriþ Baþarýlý");
			else
				System.out.println("Giriþ Baþarýsýz");
		} else
			System.out.println("Þifre girilmeden devam edilemez !");
	}
	
}
