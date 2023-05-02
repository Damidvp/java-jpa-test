/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Address;
import com.diginamic.testjpa.model.Customer;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dmouchagues
 */
public class TestjpaAddress {
    
    public static void testAddress(EntityManager em){
        Address uneAdresse = new Address();
        Customer unClient = new Customer();
        Customer unAutreClient = new Customer();
        
        uneAdresse.setCity("Montpellier");
        uneAdresse.setCountry("France");
        uneAdresse.setState("Hérault");
        uneAdresse.setStreet1("1 rue Boussairolles");
        
        unClient.setFirstName("Arno");
        unClient.setLastName("Camoa");
        unClient.setEmail("lapin.nocturne@gmail.com");
        unClient.setPhoneNumber("06 14 14 14 14");
        unClient.setAddress(uneAdresse);
        
        unAutreClient.setFirstName("Kore");
        unAutreClient.setLastName("Dahlia");
        unAutreClient.setEmail("nymphe.deseaux@gmail.com");
        unAutreClient.setAddress(uneAdresse);
        
        //Ordre des persist n'a pas d'importance
        em.getTransaction().begin(); //Démarre une transation
        em.persist(uneAdresse);
        em.persist(unClient);
        em.persist(unAutreClient);
        em.getTransaction().commit(); //Termine une transaction si résultat OK
    }
    
}
