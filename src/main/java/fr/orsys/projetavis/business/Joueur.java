package fr.orsys.projetavis.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@RequiredArgsConstructor
@Data
@ToString(callSuper=true)
public class Joueur extends Utilisateur {
	@NonNull
	@NotEmpty(message = "Veuillez entrer une date de naissance")
	private LocalDateTime dateDeNaissance;
}
