package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationCodesController {
	private VerificationCodeService verificationCodeService;

	@Autowired
	public VerificationCodesController(VerificationCodeService verificationCodeService) {
		this.verificationCodeService = verificationCodeService;
	}
	
	@GetMapping("/refreshverificationcode")
	public Result RefreshVerificationCode(@RequestParam int userId) {
		this.verificationCodeService.refreshVerificationCode(userId);
		return new SuccessResult();
	}
}
