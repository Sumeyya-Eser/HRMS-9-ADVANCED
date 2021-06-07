package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitle;


@RestController           //birden fazla controller olabilir(sipariş,seper vs)
@RequestMapping("/api/job_title")   
public class JobTitleController {

	//IOS web angular android
		//bunların anlaşması için api gerekli
		//controller istedği alır ve ne yapılacağını belirler
	
	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall") //api/jobTitle/getall--> bu istekte bulunursam bu metod çalışacak
	public DataResult<List<JobTitle>> getAll(){
		
		return jobTitleService.getAll();
	}
	@GetMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	
	@GetMapping("/findbyname")
	public DataResult<JobTitle> findByNameEquals(String name){
		return this.jobTitleService.findByNameIsNull(name);
	}
	
	
}
