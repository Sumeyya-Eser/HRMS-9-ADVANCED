package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AdminService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Admin;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
	private AdminService adminService;

	@Autowired
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@GetMapping("/admin")
    public DataResult<List<Admin>> getAll()
    {
        return adminService.getAll();
    }

}
