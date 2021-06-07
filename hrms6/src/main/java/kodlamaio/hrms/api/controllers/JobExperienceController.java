package kodlamaio.hrms.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperience")
public class JobExperienceController {
	private JobExperienceService jobExperienceService;
	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody JobExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody JobExperience jobExperience){
		return this.jobExperienceService.update(jobExperience);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.jobExperienceService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<JobExperience>> getAllByCandidateId(@RequestParam int id){
		return this.jobExperienceService.getAllByCandidatesId(id);
	}
	@GetMapping("/getById")
	public DataResult<JobExperience> getById(@RequestParam int id){
		return this.jobExperienceService.getById(id);
	}	
	@GetMapping("/getAllByCandidateIdOrderByDesc")
	public DataResult<List<JobExperience>> getAllByCandidateIdOrderByDesc(@RequestParam int id){
		return this.jobExperienceService.getAllByCandidatesIdOrderByDesc(id);
	}
	

}
