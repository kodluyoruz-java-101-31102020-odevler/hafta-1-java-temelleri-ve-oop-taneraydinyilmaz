package questionSeven; 

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;

public class PersonelReport extends Report {

	public PersonelReport(String name, String result, Date createDate) {
		super(name, result, createDate);
	}

	public String hashMD5Result() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("MD5"); 
		byte[] md5 = md.digest(result.getBytes("UTF-8"));
		return md5.toString();

	}

}
