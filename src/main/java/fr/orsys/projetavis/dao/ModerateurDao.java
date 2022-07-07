package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Moderateur;

public interface ModerateurDao extends JpaRepository<Moderateur, Long> {

}
