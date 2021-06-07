package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.AdminService;
import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.AdminDao;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Admin;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Company;

@Service
public class AdminManager implements AdminService{

	private AdminDao adminDao;
	@Autowired
	public AdminManager(AdminDao adminDao) {
		super();
		
		this.adminDao = adminDao;
	}


	@Override
	public DataResult<List<Admin>> getAll() {
		return new SuccessDataResult<>(adminDao.findAll());
	}


	@Override
	public Result verifyCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}


}
