/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.OrderLine;
import com.diginamic.testjpa.model.PurchaseOrder;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dmouchagues
 */
public class TestjpaOrder {
    
    public static void testOrder(EntityManager em){
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        
        OrderLine line1 = new OrderLine();
        OrderLine line2 = new OrderLine();
        OrderLine line3 = new OrderLine();
        OrderLine line4 = new OrderLine();
        OrderLine line5 = new OrderLine();
        
        line1.setItem("Jeu vidéo");
        line1.setUnitPrice(60D);
        line1.setQuantity(2);
        
        line2.setItem("Vinyle");
        line2.setUnitPrice(25D);
        line2.setQuantity(1);
        
        line3.setItem("Clé USB");
        line3.setUnitPrice(8D);
        line3.setQuantity(3);
        
        line4.setItem("TV THD 4K");
        line4.setUnitPrice(1800D);
        line4.setQuantity(1);
        
        line5.setItem("Livre");
        line5.setUnitPrice(20D);
        line5.setQuantity(4);
        
        purchaseOrder.getOrderLines().add(line1);
        purchaseOrder.getOrderLines().add(line2);
        purchaseOrder.getOrderLines().add(line3);
        purchaseOrder.getOrderLines().add(line4);
        purchaseOrder.getOrderLines().add(line5);
        
        em.getTransaction().begin();
        em.persist(line1);
        em.persist(line2);
        em.persist(line3);
        em.persist(line4);
        em.persist(line5);
        em.persist(purchaseOrder);
        em.getTransaction().commit();
    }
    
}
