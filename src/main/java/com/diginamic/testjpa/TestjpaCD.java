/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.CD;
import com.diginamic.testjpa.utils.JPAUtils;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dmouchagues
 */
public class TestjpaCD {

    /**
     * @param args the command line arguments
     */
    public static void testCD(EntityManager em) {
        
        CD cdLindsey = new CD();
        cdLindsey.setTitle("Artémis");
        cdLindsey.setDescription("Dernier album de Lindsey Stirling");
        cdLindsey.setPrice(25F);
        cdLindsey.getTracks().put(1, "Shadows");
        cdLindsey.getTracks().put(2, "Senbonzakura");
        cdLindsey.getTracks().put(3, "Crystallize");
        cdLindsey.getTracks().put(4, "Shatter me");
        
        em.getTransaction().begin(); //Démarre une transation
        em.persist(cdLindsey);
        em.getTransaction().commit(); //Termine une transaction si résultat OK
    }
    
}
