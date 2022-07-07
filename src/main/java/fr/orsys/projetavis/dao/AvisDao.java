package fr.orsys.projetavis.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Avis;
import fr.orsys.projetavis.business.Jeu;

public interface AvisDao extends JpaRepository<Avis, Long> {

	List<Avis> findByDateEnvoi(LocalDateTime date);

	List<Avis> findByJeu(Jeu jeu);

}
