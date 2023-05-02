/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Book;
import com.diginamic.testjpa.model.BookCategory;
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
        
        TestjpaBook.testBook(em);
        TestjpaCD.testCD(em);
        TestjpaAddress.testAddress(em);
        TestjpaOrder.testOrder(em);
        TestjpaArtist.testArtist(em);
        
        em.close();
    }
}
