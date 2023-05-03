/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diginamic.testjpa;

import com.diginamic.testjpa.model.Artist;
import com.diginamic.testjpa.model.CD;
import jakarta.persistence.EntityManager;

/**
 *
 * @author dmouchagues
 */
public class TestjpaArtist {
    
    public static void testArtist(EntityManager em){
        Artist artist1 = new Artist();
        Artist artist2 = new Artist();
        Artist artist3 = new Artist();
        Artist artist4 = new Artist();
        
        CD cd1 = new CD();
        CD cd2 = new CD();
        CD cd3 = new CD();
        CD cd4 = new CD();
        CD cd5 = new CD();
        
        artist1.setNom("Dua Lipa");
        artist2.setNom("Ben Barnes");
        artist3.setNom("K/DA");
        artist4.setNom("Florence in the machine");
        
        cd1.setTitle("You want Ben, I want you Lipa");
        cd1.setDescription("Crossover entre Dua Lipa et Ben Barnes");
        cd1.setGenre("Pop");
        cd1.setMusicCompany("Dua Lipa");
        cd1.setPrice(12F);
        cd1.setNumberOfCDs(2);
        cd1.setTotalDuration(45F);
        cd1.getArtists().add(artist1);
        cd1.getArtists().add(artist2);
        
        cd2.setTitle("I wish for you to be Drum");
        cd2.setDescription("Remix Ben & K/DA");
        cd2.setGenre("K-Pop");
        cd2.setMusicCompany("LoL Tunes");
        cd2.setPrice(18F);
        cd2.setNumberOfCDs(1);
        cd2.setTotalDuration(25F);
        cd2.getArtists().add(artist2);
        cd2.getArtists().add(artist3);
        
        cd3.setTitle("I'm levitating in League of Legends");
        cd3.setDescription("Album spécial lorsque Dua Lipa joue à League of Legends");
        cd3.setGenre("Pop");
        cd3.setMusicCompany("Dua Lipa");
        cd3.setPrice(15F);
        cd3.setNumberOfCDs(3);
        cd3.setTotalDuration(30F);
        cd3.getArtists().add(artist1);
        cd3.getArtists().add(artist3);
        
        cd4.setTitle("Pepi, pepi, pepino, I LOVE YOU OH");
        cd4.setDescription("Deux grandes femmes déclarent leur flamme à Pepino le goat");
        cd4.setGenre("Classic");
        cd4.setMusicCompany("Bowser");
        cd4.setPrice(45F);
        cd4.setNumberOfCDs(4);
        cd4.setTotalDuration(10F);
        cd4.getArtists().add(artist1);
        cd4.getArtists().add(artist4);
        
        cd5.setTitle("La super squad des artistes");
        cd5.setDescription("Honnêtement, je ne sais pas ce que ça pourrait donner ?");
        cd5.setGenre("Dubstep");
        cd5.setMusicCompany("Mega pop");
        cd5.setPrice(50F);
        cd5.setNumberOfCDs(6);
        cd5.setTotalDuration(75F);
        cd5.getArtists().add(artist1);
        cd5.getArtists().add(artist2);
        cd5.getArtists().add(artist3);
        cd5.getArtists().add(artist4);
        
        artist1.getCds().add(cd1);
        artist1.getCds().add(cd3);
        artist1.getCds().add(cd4);
        artist1.getCds().add(cd5);
        
        artist2.getCds().add(cd1);
        artist2.getCds().add(cd2);
        artist2.getCds().add(cd5);
        
        artist3.getCds().add(cd2);
        artist3.getCds().add(cd3);
        artist3.getCds().add(cd5);
        
        artist4.getCds().add(cd4);
        artist4.getCds().add(cd5);
        
        em.getTransaction().begin();
        em.persist(cd1);
        em.persist(cd2);
        em.persist(cd3);
        em.persist(cd4);
        em.persist(cd5);
        em.persist(artist1);
        em.persist(artist2);
        em.persist(artist3);
        em.persist(artist4);
        em.getTransaction().commit();
        
    }
    
}
