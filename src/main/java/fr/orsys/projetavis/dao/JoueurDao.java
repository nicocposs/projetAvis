package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Joueur;

public interface JoueurDao extends JpaRepository<Joueur, Long> {

}
