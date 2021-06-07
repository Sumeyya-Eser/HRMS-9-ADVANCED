package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeSkill;

public interface ResumeSkillService {
	Result add(ResumeSkill resumeSkill);
	Result update(ResumeSkill resumeSkill);
	Result delete(int id);
	DataResult<ResumeSkill> getById(int id);	
	DataResult<List<ResumeSkill>> getAllByCandidatesId(int id);
	DataResult<List<ResumeSkill>> getAll();

}
