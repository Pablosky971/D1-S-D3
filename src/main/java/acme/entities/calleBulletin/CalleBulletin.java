package acme.entities.calleBulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	
public class CalleBulletin extends DomainEntity{
	
	// Serialisation identifier
		
	private static final long serialVersionUID = 1L;
		
		
	@NotBlank
	private String title;
		
	@NotBlank
	private String artist;
	
	@NotBlank
	private String album;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date moment;
		

}
