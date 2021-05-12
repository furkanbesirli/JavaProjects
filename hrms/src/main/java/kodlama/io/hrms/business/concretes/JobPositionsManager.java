package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobPositionsService;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionsDao;
import kodlama.io.hrms.entities.concretes.JobPositions;


@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;

	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}




	@Override
	public List<JobPositions> getAll() {

		return this.jobPositionsDao.findAll();
	}
}
