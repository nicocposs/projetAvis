package fr.orsys.projetavis.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.orsys.projetavis.business.Avis;
import fr.orsys.projetavis.business.Jeu;
import fr.orsys.projetavis.dao.AvisDao;
import fr.orsys.projetavis.service.AvisService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AvisServiceImpl implements AvisService {
	
	private final AvisDao avisDao;

	@Override
	public List<Avis> recupererAvis() {
		return avisDao.findAll();
	}

	@Override
	public List<Avis> recupererAvis(LocalDateTime date) {
		return avisDao.findByDateEnvoi(date);
	}

	@Override
	public List<Avis> recupererAvisViaJeu(Jeu jeu) {
		return avisDao.findByJeu(jeu);
	}

	@Override
	public Avis recupererAvis(Long id) {
		if( avisDao.findById(id).isPresent()) {
			return avisDao.findById(id).get();
		}else {
			return null;
		}
	}

}
