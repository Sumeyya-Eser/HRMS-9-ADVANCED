package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.auth.AdminAuthService;
import kodlamaio.hrms.core.utilities.auth.PersonCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidateService{
	private CandidatesDao candidatesDao;
	private AdminAuthService adminAuthService;
	private PersonCheckService personCheckService;
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, AdminAuthService adminAuthService,
			PersonCheckService personCheckService) {
		super();
		this.candidatesDao = candidatesDao;
		this.adminAuthService = adminAuthService;
		this.personCheckService = personCheckService;
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<>(candidatesDao.findAll(),"Data was listed");
	}

	@Override
	public Result add(Candidates candidate) {
		 if (candidate.getFirstName() != null && candidate.getLastName() != null && candidate.getPasswordRepeat() != null && candidate.getBirthDay() != 
				 null && candidate.getPasswordRepeat() != null && candidate.getEmail()!= null && candidate.getPassword() != null) {
	            if(candidate.getPassword().equals(candidate.getPasswordRepeat()))
	            {
	                if (personCheckService.CheckIfRealPerson(candidate) && adminAuthService.adminCheckUser(candidate)) {

	                    if (!candidatesDao.existsByIdentityNumber(candidate.getIdentityNumber())) {
	                        if (!candidatesDao.existsByEmail(candidate.getEmail())) {
	                            try {
	                                this.candidatesDao.save(candidate);
	                                return new SuccessResult(adminAuthService.adminCheckUser(candidate) + " The User was verified" ) ;
	                            } catch (Exception exceptione) {
	                                return new ErrorResult("FALSE INFORMATIONS");
	                            }
	                        } else
	                            return new ErrorResult("THIS E MAIL ALREADY IS USED");
	                    } else
	                        return new ErrorResult("THIS ID NUMBER ALREADY IS USED");


	                } else
	                    return new ErrorResult("THE USER IS NOT VERİFİED");
	            }
	            else
	                return new ErrorResult("CHECK YOUR PASSWORD AND PASSWORD REPEAT");
	        }
	        else
	            return new ErrorResult("YOU MUST FILL ALL FIELD");

	    
	    
	}

	@Override
	public DataResult<Candidates> findByIdentityNumber(int identityNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result update(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Updating was successfull");
	}


}
