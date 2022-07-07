package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Avis;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
