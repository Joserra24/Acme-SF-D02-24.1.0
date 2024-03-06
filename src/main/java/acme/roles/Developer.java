
package acme.roles;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Developer extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	private String				degree;

	@NotBlank
	@Length(max = 100)
	private String				specialisation;

	@NotBlank
	@Length(max = 100)
	@ElementCollection
	private List<String>		skills;

	@NotBlank
	@Email
	private String				email;

	@URL
	@Length(max = 255)
	private String				link;
}
