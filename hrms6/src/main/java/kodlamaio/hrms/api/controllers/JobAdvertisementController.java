package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisements;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobAdvertisements jobAdvertisements){
		return ResponseEntity.ok(this.jobAdvertisementService.add(jobAdvertisements));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody JobAdvertisements jobAdvertisements){
		return ResponseEntity.ok(this.jobAdvertisementService.update(jobAdvertisements));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody JobAdvertisements jobAdvertisements){
		return ResponseEntity.ok(this.jobAdvertisementService.delete(jobAdvertisements));
	}
	
	@GetMapping("/getall")
	public  DataResult<List<JobAdvertisements>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/closeadvertisement")
	public ResponseEntity<?> CloseAdvertisement(@RequestParam JobAdvertisements jobAdvertisements){
		return ResponseEntity.ok(this.jobAdvertisementService.closeJobId(jobAdvertisements));
	}
	
	@GetMapping("/getAllActive")
	public DataResult<List<JobAdvertisements>> getAllActive(){
		return this.jobAdvertisementService.findByIsActiveTrue();
	}
	@GetMapping("/getAllActiveOrderByDate")
	public DataResult<List<JobAdvertisements>> getAllActiveOrderDate(){
		return this.jobAdvertisementService.findByIsActiveTrueOrderByCreateDate();
}

}
