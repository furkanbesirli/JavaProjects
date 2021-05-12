package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_titles")
@Data
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="position")
	String name;
	
	public JobPositions() {
		
	}

	public JobPositions(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	
	
}
