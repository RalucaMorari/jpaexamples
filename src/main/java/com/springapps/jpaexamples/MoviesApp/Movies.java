package com.springapps.jpaexamples.MoviesApp;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "movies_characters",
            joinColumns = @JoinColumn(name = "movies_id"),
            inverseJoinColumns = @JoinColumn(name = "characters_id")
    )
    private List<Characters> charactersList;

    @ManyToOne
    @JoinColumn(name = "franchises_id")
    private Franchises franchises;


    public Movies(String name) {
        this.name = name;
    }

    public Movies() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Franchises getFranchises() {
        return franchises;
    }

    public void setFranchises(Franchises franchises) {
        this.franchises = franchises;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "characters=" + charactersList +
                '}';
    }
}
