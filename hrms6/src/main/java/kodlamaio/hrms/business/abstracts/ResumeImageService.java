package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeImage;

public interface ResumeImageService {
	
	Result add(ResumeImage resumeImage, MultipartFile imageFile);
	Result update(ResumeImage resumeImage);
	Result delete(int id);
	DataResult<ResumeImage> getById(int id);	
	DataResult<List<ResumeImage>> getAll();
	DataResult<ResumeImage> getByCandidatesId(int id);

}
