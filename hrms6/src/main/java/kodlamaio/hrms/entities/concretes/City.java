package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

@Table(name="cities")
@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="city")
	private List<JobAdvertisements> jobAdvertisements;

	public City(int cityId, int id, String name, List<JobAdvertisements> jobAdvertisements) {
		super();
		this.cityId = cityId;
		this.id = id;
		this.name = name;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
