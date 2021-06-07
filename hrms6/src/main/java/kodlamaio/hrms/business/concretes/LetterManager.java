package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LetterDao;
import kodlamaio.hrms.entities.concretes.Letter;
@Service
public class LetterManager implements LetterService {
	

	private LetterDao letterDao;
	
	@Autowired
	public LetterManager(LetterDao letterDao) {
		super();
		this.letterDao = letterDao;
	}
	

	@Override
	public Result add(Letter letter) {
		this.letterDao.save(letter);
		return new SuccessResult("Letter was added");
	}

	@Override
	public Result update(Letter letter) {
		this.letterDao.save(letter);
		return new SuccessResult("Letter was updated");
	}

	@Override
	public Result delete(int id) {
		this.letterDao.deleteById(id);
		return new SuccessResult("Letter was deleted");
	}

	@Override
	public DataResult<Letter> getById(int id) {
		return new SuccessDataResult<Letter>(this.letterDao.findById(id).get());
	}

	@Override
	public DataResult<List<Letter>> getAll() {
		return new SuccessDataResult<List<Letter>>(this.letterDao.findAll());
	}

}
