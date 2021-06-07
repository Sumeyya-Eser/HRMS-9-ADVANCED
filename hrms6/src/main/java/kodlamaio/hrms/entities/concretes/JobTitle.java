package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity   //veritabanı nesnesi olduğunu belirtir
@Table(name="job_titles") // bu classın veritabanında nereye denk geldiği
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class JobTitle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@OneToMany(mappedBy="jobTitle")
	private List<JobAdvertisements> jobAdvertisements;
	
	public JobTitle() {
		
	}

	public JobTitle(int id, String title, List<JobAdvertisements> jobAdvertisements) {
		super();
		this.id = id;
		this.title = title;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<JobAdvertisements> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisements> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}



}
