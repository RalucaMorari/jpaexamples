package com.springapps.jpaexamples.MoviesApp;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FranchisesService {
    FranchisesRepository franchisesRepository;
    MoviesRepository moviesRepository;

    @Autowired
    public FranchisesService(FranchisesRepository franchisesRepository, MoviesRepository moviesRepository) {
        this.franchisesRepository = franchisesRepository;
        this.moviesRepository = moviesRepository;
    }
    public Franchises saveFranchises (Franchises franchises){
        return franchisesRepository.save(franchises);
    }

    @Transactional
    public Franchises addMoviestoFranchises(Long franchisesId, @org.jetbrains.annotations.NotNull Movies movies){
        Franchises franchises = franchisesRepository.findById(franchisesId).orElseThrow(()->new EntityNotFoundException("id not found"));
        movies.setFranchises(franchises);
        franchises.getFranchisesMovies().add(movies);
        return franchisesRepository.save(franchises);
    }
}
