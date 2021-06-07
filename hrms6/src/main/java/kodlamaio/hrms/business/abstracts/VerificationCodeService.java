package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	DataResult<List<VerificationCode>> GetAll();
	DataResult<List<VerificationCode>> GetAllByUserId(int userId);
	
	Result add(VerificationCode code);
	Result update(VerificationCode code);
	
	Result checkVerificationCode(int userId, String verificationCode);
	
	DataResult<String> createVerificationCode();
	Result refreshVerificationCode(int userId);
	DataResult<VerificationCode> setVerificationCode(String code, int userId);

}
