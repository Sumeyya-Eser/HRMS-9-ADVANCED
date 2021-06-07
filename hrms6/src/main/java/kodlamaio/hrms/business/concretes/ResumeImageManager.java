package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ResumeImageService;
import kodlamaio.hrms.core.utilities.cloudinary.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeImageDao;
import kodlamaio.hrms.entities.concretes.ResumeImage;

@Service
public class ResumeImageManager implements ResumeImageService {

	private ResumeImageDao resumeImageDao;
	private ImageService imageService;
	
	@Autowired
	public ResumeImageManager(ResumeImageDao resumeImageDao,ImageService imageService) {
		super();
		this.resumeImageDao = resumeImageDao;
		this.imageService = imageService;
	}

	@Override
	public Result update(ResumeImage resumeImage) {
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("The photo was updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeImageDao.deleteById(id);
		return new SuccessResult("The photo was deleted");
	}

	@Override
	public DataResult<ResumeImage> getById(int id) {
		return new SuccessDataResult<ResumeImage>(this.resumeImageDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeImage>> getAll() {
		return new SuccessDataResult<List<ResumeImage>>(this.resumeImageDao.findAll());	
	}

	@Override
	public DataResult<ResumeImage> getByCandidatesId(int id) {
		return new SuccessDataResult<ResumeImage>(this.resumeImageDao.getByCandidate_id(id));
	}

	@Override
	public Result add(ResumeImage resumeImage, MultipartFile imageFile) {

			Map<String,String> uploadImage = this.imageService.uploadImageFile(imageFile).getData();
			resumeImage.setUrlAddress(uploadImage.get("url"));
			this.resumeImageDao.save(resumeImage);
			return new SuccessResult("The photo was added");
		
	}

}
