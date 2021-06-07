package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Letter;

public interface LetterDao extends JpaRepository<Letter, Integer> {
	Letter getById(int id);

}
