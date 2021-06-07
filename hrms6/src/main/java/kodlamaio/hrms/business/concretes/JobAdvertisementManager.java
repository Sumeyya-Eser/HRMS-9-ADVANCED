package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;

import kodlamaio.hrms.entities.concretes.JobAdvertisements;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}


	@Override
	public DataResult<List<JobAdvertisements>> findByIsActiveTrue() {
		return new SuccessDataResult<>(jobAdvertisementDao.findByIsActiveTrue()+"Active Job Positions were listed");
	}


	@Override
	public DataResult<List<JobAdvertisements>> findByIsActiveTrueOrderByCreateDate() {
		return new SuccessDataResult<>(jobAdvertisementDao.findByIsActiveTrueOrderByCreateDate()+ " Active Job Positions were listed by order");
	}


	@Override
	public Result add(JobAdvertisements jobAdvertisements) {
		if(!jobAdvertisementDao.existsById(jobAdvertisements.getId())){
			return new SuccessResult(jobAdvertisementDao.save(jobAdvertisements).getJobDescription()+ "The Position was added to system");
		} else return new ErrorResult("This position is already active in system");
	}

	@Override
	public Result delete(JobAdvertisements jobAdvertisements) {
		jobAdvertisementDao.delete(jobAdvertisements);
		return new SuccessResult("The Job Ad was deleted");
	}


	@Override
	public DataResult<List<JobAdvertisements>> getAll() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementDao.findAll());
	}



	@Override
	public Result closeJobId(JobAdvertisements jobAdvertisements) {
		jobAdvertisements.setActive(false);
		this.update(jobAdvertisements);
		return new SuccessResult("The Job Ad was closed");
	}


	@Override
	public Result update(JobAdvertisements jobAdvertisements) {
		jobAdvertisementDao.save(jobAdvertisements);
		return new SuccessResult("Updating was succesfull");
	}




}
