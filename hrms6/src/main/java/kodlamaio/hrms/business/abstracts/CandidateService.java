package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidateService {
	DataResult<List<Candidates>> getAll();
	Result add(Candidates candidate);

	DataResult<Candidates> findByIdentityNumber(int identityNumber);
	Result update(Candidates candidates);
}
