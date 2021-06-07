package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name = "resume_images")
public class ResumeImage   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
		
	@JsonIgnore
	@Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();

	
	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	
	
	@Column(name = "url_address")
	private String urlAddress;
	
	@OneToOne()
    @JoinColumn(name = "candidate_id", referencedColumnName = "user_id")
    private Candidates candidate;

	public ResumeImage(int id, LocalDate createdDate, boolean isActive, String urlAddress, Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.urlAddress = urlAddress;
		this.candidate = candidate;
	}

	public ResumeImage() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getUrlAddress() {
		return urlAddress;
	}

	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}

	
	

}