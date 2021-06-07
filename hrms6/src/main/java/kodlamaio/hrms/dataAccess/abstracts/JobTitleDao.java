package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

	boolean existsByTitle(String title);
	//check if the position name is already registered system
	
	JobTitle findByTitle(String title);
	JobTitle findById(int id);
}
