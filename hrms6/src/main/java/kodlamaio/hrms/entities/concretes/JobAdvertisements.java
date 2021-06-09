package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="job_advertisement")
public class JobAdvertisements {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_ad_id")
	private int jobId;
	
	@Column(name="job_descriptions")
	private String jobDescription;
	
	@Column(name="min_payments")
	private String minPayment;
	
	@Column(name="max_payments")
	private String maxPayment;
	
	@Column(name="open_position_numbers")
	private int openPositionNumber;
	
	@Column(name="last_apply_dates")
	private Date lastApplyDate;
	
	@Column(name="is_actives",columnDefinition = "boolean default true")
	private boolean isActive;
	
	@Column(name="create_dates")
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;

	public JobAdvertisements(int id, int jobId, String jobDescription, String minPayment, String maxPayment,
			int openPositionNumber, Date lastApplyDate, boolean isActive, Date createDate, City city,
			JobTitle jobTitle) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.jobDescription = jobDescription;
		this.minPayment = minPayment;
		this.maxPayment = maxPayment;
		this.openPositionNumber = openPositionNumber;
		this.lastApplyDate = lastApplyDate;
		this.isActive = isActive;
		this.createDate = createDate;
		this.city = city;
		this.jobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getMinPayment() {
		return minPayment;
	}

	public void setMinPayment(String minPayment) {
		this.minPayment = minPayment;
	}

	public String getMaxPayment() {
		return maxPayment;
	}

	public void setMaxPayment(String maxPayment) {
		this.maxPayment = maxPayment;
	}

	public int getOpenPositionNumber() {
		return openPositionNumber;
	}

	public void setOpenPositionNumber(int openPositionNumber) {
		this.openPositionNumber = openPositionNumber;
	}

	public Date getLastApplyDate() {
		return lastApplyDate;
	}

	public void setLastApplyDate(Date lastApplyDate) {
		this.lastApplyDate = lastApplyDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	
	
	
}
