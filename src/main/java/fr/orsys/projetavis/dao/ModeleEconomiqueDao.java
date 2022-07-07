package fr.orsys.projetavis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.projetavis.business.ModeleEconomique;

public interface ModeleEconomiqueDao extends JpaRepository<ModeleEconomique,Long>{
	
}
