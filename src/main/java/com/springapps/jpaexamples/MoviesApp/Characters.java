package com.springapps.jpaexamples.MoviesApp;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "characters")
public class Characters {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "charactersList")
    private List<Movies> charactersMovies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Characters(String name) {
        this.name = name;
    }

    public Characters() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movies> getCharactersMovies() {
        return charactersMovies;
    }

    public void setCharactersMovies(List<Movies> charactersMovies) {
        this.charactersMovies = charactersMovies;
    }

    @Override
    public String toString() {
        return "Character{" +
                ", charactersMovies=" + charactersMovies +
                '}';
    }
}

