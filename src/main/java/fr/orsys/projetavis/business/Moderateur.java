package fr.orsys.projetavis.business;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@RequiredArgsConstructor
@Data
@ToString(callSuper=true)
public class Moderateur extends Utilisateur{
	@NonNull
	@NotEmpty(message="Veuillez entrer un numéro")
	@Pattern(regexp="/^(\\+33 |0)[0-9]( \\d\\d){4}$/",message="Veuillez entrer un numéro respectant le format 0XXXXXXXXX ou +33XXXXXXXXX")
	private String numeroDeTelephone;
}

