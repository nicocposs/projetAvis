package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
