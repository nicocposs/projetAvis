package fr.orsys.projetavis.business;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data

public class Jeu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@NotEmpty(message = "Veuillez remplir le champ")
	private String nom;
	@NonNull
	@NotEmpty(message = "Veuillez remplir le champ")
	private String description;
	@NotEmpty
	@NotEmpty(message = "Veuillez remplir le champ")
	private LocalDate datesortie;
	@NonNull
	@NotEmpty(message = "Veuillez remplir le champ")
	private String image;
	@OneToMany(mappedBy = "jeu")
	private List<Avis> avis;
	@ManyToOne
	private Moderateur moderateur;
	@ManyToOne
	@NotNull(message="veuillez choisir une classificaiton")
	private Classification classification;
	@ManyToOne
	@NotNull(message="veuillez choisir un éditeur")
	private Editeur editeur;
	@ManyToMany
	@NotNull(message="veuillez choisir une plateforme")
	private List<Plateforme> plateformes;
	@ManyToOne
	@NotNull(message="veuillez choisir un genre")
	private Genre genre;
	@ManyToOne
	@NotNull(message="veuillez choisir un Modele économique")
	private ModeleEconomique modeleEconomique;
}
