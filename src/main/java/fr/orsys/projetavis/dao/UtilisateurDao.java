package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
