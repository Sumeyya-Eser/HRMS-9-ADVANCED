package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Letter;

public interface LetterService {

	
	Result add(Letter letter);
	Result update(Letter letter);
	Result delete(int id);
	DataResult<Letter> getById(int id);	
	DataResult<List<Letter>> getAll();
}
