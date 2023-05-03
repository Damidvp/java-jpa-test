/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmouchagues
 */
@Entity
public class Book extends Item{

    private String isbn;
    private Integer nbOfPages;
    private Boolean hasIllustration;
    @Transient
    private Instant instant = Instant.now();
    //Sans EnumType : par défaut, retourne l'index de l'élément dans l'énumération (ordinal)
    @Enumerated(EnumType.STRING)
    private BookCategory category;
    @ElementCollection
    private List<String> tags = new ArrayList<>();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public Boolean getHasIllustration() {
        return hasIllustration;
    }

    public void setHasIllustration(Boolean hasIllustration) {
        this.hasIllustration = hasIllustration;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
}
