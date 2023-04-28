/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Book;
import com.diginamic.testjpa.utils.JPAUtils;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dmouchagues
 */
public class Testjpa {

    public static void main(String[] args) {
        EntityManager em = JPAUtils.getInstance().getEntityManager();
        System.out.println("Entity Manager récupéré, GG!");
        
        Book livre = new Book();
        livre.setTitle("Shadow and bones");
        livre.setDescription("Histoire fantastique dans un monde apocalyptique");
        livre.setPrice(30F);
        livre.setHasIllustration(true);
        livre.setNbOfPages(300);
        
        Book livre2 = new Book();
        livre2.setTitle("Cyrano de Bergerac");
        
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
        
        em.close();
    }
}
