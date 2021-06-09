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
@Table(name="resume_experiences")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobExperience   {
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

	@Column(name = "ended_date", nullable = true)
	private LocalDate endedDate;
	
	@Column(name= "started_date")
	private LocalDate startedDate;
	
	@Column(name= "company_name")
	private String compnayName;
	
	
	@Column(name= "position")
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Candidates candidate;

	public JobExperience(int id, LocalDate createdDate, boolean isActive, LocalDate endedDate, LocalDate startedDate,
			String compnayName, String position, Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.endedDate = endedDate;
		this.startedDate = startedDate;
		this.compnayName = compnayName;
		this.position = position;
		this.candidate = candidate;
	}

	public JobExperience() {
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

	public LocalDate getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(LocalDate endedDate) {
		this.endedDate = endedDate;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public String getCompnayName() {
		return compnayName;
	}

	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}
	
	
}

