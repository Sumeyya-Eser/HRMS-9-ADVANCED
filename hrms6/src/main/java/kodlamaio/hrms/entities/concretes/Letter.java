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

@Table(name = "letter_of_acceptance")

@PrimaryKeyJoinColumn(name="user_id")
public class Letter {
	
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
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	@JsonIgnore
	private Candidates candidate;
	
	public Letter(String content, int candidateId) {
		super();
		this.content = content;
		this.candidate.setId(candidateId);
		
		
		
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}

	public Letter(int id, LocalDate createdDate, boolean isActive, String content, Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.content = content;
		this.candidate = candidate;
	}


	
}