package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Editeur;

public interface EditeurDao extends JpaRepository<Editeur, Long> {

}
