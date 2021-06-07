package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.entities.concretes.JobTitle;



public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
	DataResult<JobTitle> findByNameIsNull(String jobTitle);

}
