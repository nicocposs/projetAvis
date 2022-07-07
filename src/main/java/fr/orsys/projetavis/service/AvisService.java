package fr.orsys.projetavis.service;

import java.time.LocalDateTime;
import java.util.List;

import fr.orsys.projetavis.business.Avis;
import fr.orsys.projetavis.business.Jeu;

public interface AvisService {
	List<Avis> recupererAvis();
	
	List<Avis> recupererAvis(LocalDateTime date);
	
	List<Avis> recupererAvisViaJeu(Jeu jeu);
	
	Avis recupererAvis(Long id);
}
