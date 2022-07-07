package fr.orsys.projetavis.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public abstract class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@NonNull
	@NotEmpty(message = "Veuillez entrer un pseudo")
	protected String pseudo;
	
	@NonNull
	@Length(min=5, max=25, message="Veuillez entrer un mot de passe entre 5 et 25 caractères")
	protected String motDePasse;
	
	@NonNull
	@NotEmpty(message = "Veuillez entrer un email")
	@Pattern(regexp="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message="Veuillez entrer un mail dans le format XXXXX@XXXXX.XXX")
	protected String email;
}
