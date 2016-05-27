/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.test;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/**
 *
 * @author patrickribeiroamaral
 */
public class TestArticle {
    
    private Article art;
    private Article art2;
    private Article art3;
    private Article art4;
    
    
    @BeforeMethod
    public void setUp() {
        art=new Article(2,"Lunettes virtuels",23.55);
        art2=new Article(2,"Lunettes virtuels",23.55);
        art3=new Article(5,"Lunettes fff",27.55);
        art4=new Article(7,"Xylophone volant",29.55);
    }
    
    
    @Test
    public void testArticleEquals_si_identique()
    {
        assertEquals(art,art2);
    }
    @Test
    public void testArticleEquals_si_not_identique()
    {
        assertNotEquals(art3,art4);
    }
    @Test
    public void testArticleCompareTo_si_not_identiqueEtPlusPetit()
    {
        
        assertTrue(art.compareTo(art4)<0);
    }
    @Test
    public void testArticleCompareTo_si_not_identiqueEtPlusGrand()
    {
        
        assertTrue(art4.compareTo(art)>0);
    }
    @Test
    public void testArticleCompareTo_si_identique()
    {
        assertTrue(art.compareTo(art2)==0);
    }
    
    @Test
    public void testArticleRetourneId_si_identique()
    {
        assertEquals(art.getId(),art2.getId());
    }
    
    @Test
    public void testArticleRetourneId_si_not_identique()
    {
        assertNotEquals(art3.getId(),art4.getId());
    }
    
    @Test
    public void testArticleRetourneDesignation_si_identique()
    {
        
        assertEquals(art.getDesignation(),art2.getDesignation());
    }
    
    @Test
    public void testArticleRetourneDesignation_si_not_identique()
    {
        assertNotEquals(art3.getDesignation(),art4.getDesignation());
    }
    
    @Test
    public void testArticleRetournePrix_si_identique()
    {
        
        assertEquals(art.getPrix(),art2.getPrix());
    }
    
    @Test
    public void testArticleRetournePrix_si_not_identique()
    {
        assertNotEquals(art3.getPrix(),art4.getPrix());
    }
    
    @Test
    public void testArticleString_si_Identique()
    {
    assertEquals(art.toString(),art2.toString());
    }
    
    @Test
    public void testArticleString_si_not_identique()
    {
        assertNotEquals(art3.toString(),art4.toString());
    }
}
