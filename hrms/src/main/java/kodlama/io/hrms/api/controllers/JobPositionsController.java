package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobPositionsService;
import kodlama.io.hrms.entities.concretes.JobPositions;


@RestController
@RequestMapping("api/job_titles")
public class JobPositionsController {
	
	private JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionsService.getAll();

	}
	

}
