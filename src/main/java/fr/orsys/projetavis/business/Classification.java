package fr.orsys.projetavis.business;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@RequiredArgsConstructor
@Data
public class Classification {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@NotEmpty(message = "Veuillez remplir le champ")
	private String nom;
	@OneToMany(mappedBy = "classification")
	private List<Jeu> jeux;

}
