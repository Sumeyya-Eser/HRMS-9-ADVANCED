package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.JobAdvertisements;

public interface JobAdvertisementService {
	
	Result update(JobAdvertisements jobAdvertisements);
	Result delete(JobAdvertisements jobAdvertisements);
	
	DataResult<List<JobAdvertisements>> getAll();
	
	DataResult<List<JobAdvertisements>> findByIsActiveTrue();
	DataResult<List<JobAdvertisements>> findByIsActiveTrueOrderByCreateDate();
	Result add(JobAdvertisements jobAdvertisements);
	Result closeJobId(JobAdvertisements jobAdvertisements);
	//DataResult<List<JobAdvertisements>> getAllActiveWithCompanyName(String companyName);
	


}
