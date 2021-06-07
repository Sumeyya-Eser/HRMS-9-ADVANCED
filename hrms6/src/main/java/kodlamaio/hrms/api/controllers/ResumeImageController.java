package kodlamaio.hrms.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.business.abstracts.ResumeImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.ResumeImage;
@RestController
@RequestMapping("/api/images")
public class ResumeImageController {
	
	private ResumeImageService resumeImageService;
	private CandidateService candidateService;
	
	@Autowired
	public ResumeImageController(ResumeImageService resumeImageService,CandidateService candidateService) {
		super();
		this.resumeImageService = resumeImageService;
		this.candidateService = candidateService;
	}

	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		Candidates candidate = this.candidateService.findByIdentityNumber(id).getData();
		ResumeImage resumeImage = new ResumeImage();
		resumeImage.setCandidate(candidate);
		return this.resumeImageService.add(resumeImage, imageFile);
	}
	@PostMapping("/update")
	public Result update( @RequestBody ResumeImage resumeImage){
		return this.resumeImageService.update(resumeImage);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeImageService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeImage>> getAll(){
		return this.resumeImageService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<ResumeImage> getByCandidateId(@RequestParam int id){
		return this.resumeImageService.getByCandidatesId(id);
	}
	@GetMapping("/getById")
	public DataResult<ResumeImage> getById(@RequestParam int id){
		return this.resumeImageService.getById(id);
	}


}
