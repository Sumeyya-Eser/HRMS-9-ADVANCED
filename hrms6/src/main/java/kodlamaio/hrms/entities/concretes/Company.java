package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Table(name="companies")
@Entity
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName="id")
public class Company extends User{

	public Company(int id, String email, String password) {
		super(id, email, password);
	}
	@Column(name="employer_id")
	private int employerId;

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAdress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	private String passwordRepeat;

	public Company(int id, String email, String password, int employerId, String companyName, String webAdress,
			String phoneNumber, boolean isVerified, String passwordRepeat) {
		super(id, email, password);
		this.employerId = employerId;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
		this.passwordRepeat = passwordRepeat;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAdress() {
		return webAdress;
	}

	public void setWebAdress(String webAdress) {
		this.webAdress = webAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	
	

	
	
	
	
}
