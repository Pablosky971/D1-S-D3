package acme.entities.technologyRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class TechnologyRecords extends DomainEntity{
	
	// Serialisation identifier
	
		private static final long serialVersionUID = 1L;
		
	    @NotBlank
		String title;
	    
	    @NotBlank
		String activitySector;
	    
	    @NotBlank
	    String inventor;
	    
	    @NotBlank
	    String description ;
	    
	    @URL
	    @NotBlank
	    String website;
	    
	    @Email
	    @NotBlank
	    String email;
	    
	    @NotNull
	    Indication indication;
	    
	   @Min(1)
	   @Max(10)
	    Integer stars;
	    
	    
	    
			

}
