package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody City city){
		return ResponseEntity.ok(this.cityService.add(city));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody City city){
		return ResponseEntity.ok(this.cityService.update(city));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody City city){
		return ResponseEntity.ok(this.cityService.delete(city));
	}
	
	
	@GetMapping("/getall")
	public  DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}

}
