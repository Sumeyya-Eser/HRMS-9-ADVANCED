package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.*;

public interface AdminService {
	//Result add(Admin admin);
	DataResult<List<Admin>> getAll();

	Result verifyCompany(Company company);

}
