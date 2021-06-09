package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

import java.time.LocalDate;

import java.util.List;

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
	
	@OneToMany(mappedBy="candidate")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy="candidate")
	private List<Education> education;
	
	@OneToMany(mappedBy="candidate")
	private List <Language> language;
	
	@OneToMany(mappedBy="candidate")
	private List<Letter> letter;
	
	@OneToMany(mappedBy="candidate")
	private List<ResumeLink> resumeLink;
	
	@OneToMany(mappedBy="candidate")
	private List<ResumeSkill> resumeSkill;
	
	private String passwordRepeat;

	public Candidates(int id, String email, String password, String firstName, String lastName, String identityNumber,
			LocalDate birthDay, List<JobExperience> jobExperience, List<Education> education, List<Language> language,
			List<Letter> letter, List<ResumeLink> resumeLink, List<ResumeSkill> resumeSkill, String passwordRepeat) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDay = birthDay;
		this.jobExperience = jobExperience;
		this.education = education;
		this.language = language;
		this.letter = letter;
		this.resumeLink = resumeLink;
		this.resumeSkill = resumeSkill;
		this.passwordRepeat = passwordRepeat;
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

	public List<JobExperience> getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(List<JobExperience> jobExperience) {
		this.jobExperience = jobExperience;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Language> getLanguage() {
		return language;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	public List<Letter> getLetter() {
		return letter;
	}

	public void setLetter(List<Letter> letter) {
		this.letter = letter;
	}

	public List<ResumeLink> getResumeLink() {
		return resumeLink;
	}

	public void setResumeLink(List<ResumeLink> resumeLink) {
		this.resumeLink = resumeLink;
	}

	public List<ResumeSkill> getResumeSkill() {
		return resumeSkill;
	}

	public void setResumeSkill(List<ResumeSkill> resumeSkill) {
		this.resumeSkill = resumeSkill;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	
}
