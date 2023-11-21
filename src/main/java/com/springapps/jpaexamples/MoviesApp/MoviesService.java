package com.springapps.jpaexamples.MoviesApp;


import org.springframework.stereotype.Service;

@Service
public class MoviesService {
    MoviesRepository moviesRepository;
    FranchisesRepository franchisesRepository;

    public MoviesService(MoviesRepository moviesRepository, FranchisesRepository franchisesRepository) {
        this.moviesRepository = moviesRepository;
        this.franchisesRepository = franchisesRepository;
    }

    public Movies saveMovies(Movies movies) {
        return moviesRepository.save(movies);
    }

}
