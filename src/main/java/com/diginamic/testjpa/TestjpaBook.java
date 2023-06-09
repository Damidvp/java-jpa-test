/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Book;
import com.diginamic.testjpa.model.BookCategory;
import jakarta.persistence.EntityManager;

/**
 *
 * @author zdamy
 */
public class TestjpaBook {
    
    public static void testBook(EntityManager em){
        Book livre = new Book();
        livre.setTitle("Shadow and bones");
        livre.setDescription("Histoire fantastique dans un monde apocalyptique");
        livre.setPrice(30F);
        livre.setHasIllustration(true);
        livre.setNbOfPages(300);
        livre.setCategory(BookCategory.FANTASTIQUE);
        livre.getTags().add("Darkling");
        livre.getTags().add("Monde imaginaire");
        livre.getTags().add("Dystopie");
        livre.getTags().add("Fantaisie");
        livre.getTags().add("Magie");
        
        Book livre2 = new Book();
        livre2.setTitle("Cyrano de Bergerac");
        livre2.setCategory(BookCategory.THEATRE);
        
        em.getTransaction().begin(); //Démarre une transation
        em.persist(livre);
        em.persist(livre2);
        em.getTransaction().commit(); //Termine une transaction si résultat OK
        
        Book rechercheLivre = em.find(Book.class, 1);
        if(rechercheLivre != null){
            System.out.println("Livre trouvé : " + rechercheLivre.toString());
        } else {
            System.out.println("Aucun résultat trouvé pour l'ID n°1");
        }
    }
    
}
