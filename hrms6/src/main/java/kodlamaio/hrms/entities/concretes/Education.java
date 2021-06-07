package kodlamaio.hrms.entities.concretes;
import java.time.LocalDate;
import java.util.Date;

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
@Table(name="resume_educations")
@PrimaryKeyJoinColumn(name="user_id")
public class Education   {
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

	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "started_date")
	private Date startedDate;
	
	@Column(name = "ended_date", nullable = true)
	private Date endedDate;
	
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidates candidate;


	public Education(int id, LocalDate createdDate, boolean isActive, String schoolName, String department,
			Date startedDate, Date endedDate, Candidates candidate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.schoolName = schoolName;
		this.department = department;
		this.startedDate = startedDate;
		this.endedDate = endedDate;
		this.candidate = candidate;
	}


	public Education() {
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


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Date getStartedDate() {
		return startedDate;
	}


	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}


	public Date getEndedDate() {
		return endedDate;
	}


	public void setEndedDate(Date endedDate) {
		this.endedDate = endedDate;
	}


	public Candidates getCandidate() {
		return candidate;
	}


	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}
	
	
	
	
}