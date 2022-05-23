package kodlamaio.HRMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers")
@EqualsAndHashCode(callSuper=false)
public class Employer extends User{
	
	@Column(name="company_name")
	@NotNull
	@NotBlank
	public String companyName;
	
	@Column(name="company_web_site")
	@NotNull
	@NotBlank
	public String companyWebSite;
	
	@Column(name="phone_number")
	@NotNull
	@NotBlank
	public String phoneNumber;
	
	@Column(name="tax_number")
	@NotNull
	@NotBlank
	public String taxNumber;
	
	@Column(name="creation_date")
	private LocalDate creationDate;

}
