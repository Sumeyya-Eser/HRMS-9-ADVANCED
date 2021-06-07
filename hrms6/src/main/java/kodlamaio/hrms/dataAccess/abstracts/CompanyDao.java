package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company,Integer> {

	boolean existsByEmail(String email);
	//check; if already signed by same e mail
}
