package kodlamaio.hrms.entities.concretes;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.naming.Name;
import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Table(name="candidates")
@Entity
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName="id")
public class Candidates extends User{
	
	public Candidates(int id, String email, String password) {
		super(id, email, password);
	}

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private LocalDate birthDay;
	
	private String passwordRepeat;

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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	
	

	

}
