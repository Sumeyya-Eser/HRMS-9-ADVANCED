package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="birth_date")
	private String birthDate;

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="password_repeat")
	private String passwordRepeat;
	
	@Column(name="web_Address")
	private String webAddress;

	public Employee(int id, int userId, String firstName, String lastName, String phoneNumber, String nationalityId,
			String birthDate, String companyName, String passwordRepeat, String webAddress) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.nationalityId = nationalityId;
		this.birthDate = birthDate;
		this.companyName = companyName;
		this.passwordRepeat = passwordRepeat;
		this.webAddress = webAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
}
