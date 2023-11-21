package com.springapps.jpaexamples.MoviesApp;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "franchises")
public class Franchises {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "franchises", cascade = CascadeType.PERSIST, orphanRemoval = true)
    public List<Movies> franchisesMovies;

    public Franchises(String name) {
        this.name = name;
    }

    public Franchises() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movies> getFranchisesMovies() {
        return franchisesMovies;
    }

    public void setFranchisesMovies(List<Movies> franchisesMovies) {
        this.franchisesMovies = franchisesMovies;
    }

    @Override
    public String toString() {
        return "Franchises{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", franchiseMovies=" + franchisesMovies +
                '}';
    }
}
