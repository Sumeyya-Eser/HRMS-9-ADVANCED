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

import kodlamaio.hrms.business.abstracts.LetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Letter;


@RestController
@RequestMapping("/api/letter")
public class LetterController {
	
	@Autowired
	private LetterService letterService;
	

	@PostMapping("/add")
	public Result add( @RequestBody Letter letter){
		return this.letterService.add(letter);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody Letter letter){
		return this.letterService.update(letter);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.letterService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Letter>> getAll(){
		return this.letterService.getAll();
	}
	

	@GetMapping("/getById")
	public DataResult<Letter> getById(@RequestParam int id){
		return this.letterService.getById(id);
	}


}
