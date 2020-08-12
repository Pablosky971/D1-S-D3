package acme.entities.notice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	
public class Notice extends DomainEntity{
	
	// Serialisation identifier
		
	private static final long serialVersionUID = 1L;
		
	@NotBlank	
	@URL
	private String picture;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	private Date creation;
		
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date deadline;
	
	@NotBlank
	private String body;
	
	@URL
	private String optional1;
	
	@URL
	private String optional2;
		

}
