package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Classification;

public interface ClassificationDao extends JpaRepository<Classification, Long> {

}
