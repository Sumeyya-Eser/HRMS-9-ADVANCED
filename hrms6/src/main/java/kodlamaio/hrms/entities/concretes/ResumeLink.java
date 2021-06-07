package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "resume_links")
@PrimaryKeyJoinColumn(name="user_id")
public class ResumeLink   {
	
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

	@Column(name = "name")
	private String name;

	@Column(name = "url_address")
	private String url;

	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidates candidate;

	public ResumeLink(int id, LocalDate createdDate, boolean isActive, String name, String url, Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.name = name;
		this.url = url;
		this.candidate = candidate;
	}

	public ResumeLink() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}
	
	

}