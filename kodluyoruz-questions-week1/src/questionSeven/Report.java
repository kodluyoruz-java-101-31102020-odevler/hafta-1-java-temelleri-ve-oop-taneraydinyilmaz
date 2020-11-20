package questionSeven;

import java.sql.Date;

public abstract class Report {

	String name;
	String result;
	Date createDate;
	String runQuery;

	public Report(String runQuery) {
		this.runQuery = runQuery;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (runQuery == null) {
			if (other.runQuery != null)
				return false;
		} else if (!runQuery.equals(other.runQuery))
			return false;
		return true;
	}

	public Report(String name, String result, Date createDate) {
		this.name = name;
		this.result = result;
		this.createDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
