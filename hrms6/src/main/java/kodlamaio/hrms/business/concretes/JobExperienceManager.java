package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService  {
	
	JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("The experience was added");
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("The experience was updated");
	}

	@Override
	public Result delete(int id) {
		this.jobExperienceDao.deleteById(id);
		return new SuccessResult("The experience was deleted");
	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>(this.jobExperienceDao.getById(id));
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll());
	}

	@Override
	public DataResult<List<JobExperience>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByCandidate_id(id));
	}

	@Override
	public DataResult<List<JobExperience>> getAllByCandidatesIdOrderByDesc(int id) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByCandidate_idOrderByEndedDateDesc(id));
	}

}
