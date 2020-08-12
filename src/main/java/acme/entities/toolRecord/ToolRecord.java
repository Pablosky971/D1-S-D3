package acme.entities.toolRecord;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	
public class ToolRecord extends DomainEntity{
	
	// Serialisation identifier
		
	private static final long serialVersionUID = 1L;
		
	@NotBlank
	private String title;
	
	@NotBlank
	private String sector;
		
	@NotBlank
	private String inventor;
	
	@NotBlank
	@Length(min = 20)
	private String description;
	
	@NotBlank
	@URL
	private String website;
	
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	private TypeSource tipo;
	
	@NotNull
	@Min(value = 0)
	@Max(value = 5)
	private Integer				stars;
		

}
