/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author dmouchagues
 */
public class TestjpaJPQL {
    
    public static void testJPQL(EntityManager em){
        TypedQuery<Customer> typedQuery = em.createQuery("SELECT c FROM Customer c WHERE c.address.city = :city", Customer.class);
        typedQuery.setParameter("city", "Montpellier");
        List<Customer> customers = typedQuery.getResultList();
        for(Customer unCustomer : customers){
            System.out.println(unCustomer.toString());
        }
        
        TypedQuery<Customer> namedQuery = em.createNamedQuery("Customer.findByCity", Customer.class);
        namedQuery.setParameter("city", "Montpellier");
        List<Customer> customers2 = namedQuery.getResultList();
        for(Customer unCustomer : customers2){
            System.out.println(unCustomer.toString());
        }
        
        TypedQuery<Customer> namedQuery2 = em.createNamedQuery("Customer.findByZipcode", Customer.class);
        namedQuery2.setParameter("zipcode", "34000");
        List<Customer> customers3 = namedQuery2.getResultList();
        for(Customer unCustomer : customers3){
            System.out.println(unCustomer.toString());
        }
    }
    
}
