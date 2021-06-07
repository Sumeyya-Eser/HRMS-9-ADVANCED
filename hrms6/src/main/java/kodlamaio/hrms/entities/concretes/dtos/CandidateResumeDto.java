package kodlamaio.hrms.entities.concretes.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.ResumeImage;
import kodlamaio.hrms.entities.concretes.ResumeLink;
import kodlamaio.hrms.entities.concretes.ResumeSkill;

public class CandidateResumeDto {
	
	public Candidates candidate;
	public List<Education> educations;
	public List<ResumeSkill> resumeSkills;
	public List<ResumeLink> resumeLinks;
	public List<JobExperience> jobExperiences;
	public List<Language> languages;
	public ResumeImage image;

}
