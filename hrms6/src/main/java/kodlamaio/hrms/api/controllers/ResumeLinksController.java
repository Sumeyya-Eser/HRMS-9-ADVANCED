package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeLink;


@RestController
@RequestMapping("/api/links")
public class ResumeLinksController {
	private ResumeLinkService resumeLinkService;
	
	@Autowired
	public ResumeLinksController(ResumeLinkService resumeLinkService) {
		super();
		this.resumeLinkService = resumeLinkService;
	}

	@PostMapping("/add")
	public Result add( @RequestBody ResumeLink resumeLink){
		return this.resumeLinkService.add(resumeLink);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeLink resumeLink){
		return this.resumeLinkService.update(resumeLink);
		
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int  id){
		return this.resumeLinkService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeLink>> getAll(){
		return this.resumeLinkService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ResumeLink>> getAllByCandidateId(@RequestParam int id){
		return this.resumeLinkService.getAllByCandidatesId(id);
	}
	@GetMapping("/getById")
	public DataResult<ResumeLink> getById(@RequestParam int id){
		return this.resumeLinkService.getById(id);
	}

}
