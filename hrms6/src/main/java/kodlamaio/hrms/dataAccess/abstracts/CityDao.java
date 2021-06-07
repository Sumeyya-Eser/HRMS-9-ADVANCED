package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.*;

public interface CityDao extends JpaRepository<City,Integer> {
	City findById(int id);

}
