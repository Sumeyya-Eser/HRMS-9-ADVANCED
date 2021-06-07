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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "resume_languages")

@PrimaryKeyJoinColumn(name="user_id")
public class Language     {
	
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

	
	@Min(value = 1 )
	@Max(value = 5)	
	@Column(name="level")
	private int level;
	
	@Column(name="language_name")
	private String languageName;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidates candidate;

	public Language(int id, LocalDate createdDate, boolean isActive, @Min(1) @Max(5) int level, String languageName,
			Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.level = level;
		this.languageName = languageName;
		this.candidate = candidate;
	}

	public Language() {
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}
	
	

}