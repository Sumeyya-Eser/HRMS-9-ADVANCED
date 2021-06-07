package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

@Table(name="cities")
@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="city")
	private List<JobAdvertisements> jobAdvertisements;

	public City(int id, int cityId, String name, List<JobAdvertisements> jobAdvertisements) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.name = name;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<JobAdvertisements> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisements> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}

	

	
}
