package com.springapps.jpaexamples.MoviesApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface FranchisesRepository extends JpaRepository<Franchises, Long> {
    }


