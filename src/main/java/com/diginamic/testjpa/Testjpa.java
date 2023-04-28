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
        
        em.getTransaction().begin(); //Démarre une transation
        em.persist(livre);
        em.getTransaction().commit(); //Termine une transaction si résultat OK
        
        em.close();
    }
}
