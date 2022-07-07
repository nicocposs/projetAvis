package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Jeu;

public interface JeuDao extends JpaRepository<Jeu, Long> {

}
