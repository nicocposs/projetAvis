package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Plateforme;

public interface PlateformeDao extends JpaRepository<Plateforme, Long> {

}
