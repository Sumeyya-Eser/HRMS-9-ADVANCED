package kodlamaio.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.*;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisements,Integer> {
	 List<JobAdvertisements> findByIsActiveTrue();
     List<JobAdvertisements> findByIsActiveTrueOrderByCreateDate();
 //    List<JobAdvertisements> findAllActiveTrueAndCompany_EmployerId(int employerId);

}
