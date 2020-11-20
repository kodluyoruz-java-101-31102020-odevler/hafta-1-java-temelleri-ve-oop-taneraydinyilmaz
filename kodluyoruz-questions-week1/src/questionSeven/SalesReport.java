package questionSeven;

import java.sql.Date;

public class SalesReport extends Report {

	private String[] authorizedDepartment;

	public SalesReport(String name, String result, Date createDate) {
		super(name, result, createDate);
	}

	public String[] getAuthorizedDepartment() {
		return authorizedDepartment;
	}

	public void setAuthorizedDepartment(String[] authorizedDepartment) {
		this.authorizedDepartment = authorizedDepartment;
	}

}
