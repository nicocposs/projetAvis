package fr.orsys.projetavis.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
public class Avis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	@NotEmpty(message = "Veuillez entrer une description")
	private String description;
	
	@NonNull
	private LocalDateTime dateEnvoi;
	
	@NonNull
	@NotEmpty(message = "Veuillez entrer une note")
	@Range(min = 0, max = 20, message = "Veuillez entrez une note entre 0 et 20")
	private Float note;
	
	private LocalDateTime dateModeration;
	
	@NotNull(message = "Veuillez choisir un jeu")
	@NonNull
	@ManyToOne
	private Jeu jeu;
	
	@NonNull
	@ManyToOne
	private Moderateur moderateur;
}
