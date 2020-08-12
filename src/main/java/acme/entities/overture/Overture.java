package acme.entities.overture;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	
public class Overture extends DomainEntity{
	
	// Serialisation identifier
		
	private static final long serialVersionUID = 1L;
		
	@NotBlank	
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Past
	private Date creation;
		
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date deadline;
	
	@NotBlank
	@Length(min = 20) //Aquí podríamos añadir también un máximo
	private String description;
	
	@NotNull
	@Valid
	private Money minMoney;
	
	@NotNull
	@Valid
	private Money maxMoney;
	
	@Email
	@NotBlank
	private String email;
		

}
