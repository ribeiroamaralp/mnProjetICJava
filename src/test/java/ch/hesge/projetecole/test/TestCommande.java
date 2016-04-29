/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.test;
import ch.hesge.projetecole.domaine.Commande;
import ch.hesge.projetecole.domaine.Article;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/**
 *
 * @author patrickribeiroamaral
 */
public class TestCommande {
    
    private Article art;
    private Article art2;
    private Article art3;
    private Article art4;
    private Commande comm;
    private Commande comm2;
    private Commande comm3;
    private Commande comm4;
    
    @BeforeMethod
    public void setUp() {
        art=new Article(2,"Lunettes virtuels",23.55);
        art2=new Article(2,"Lunettes virtuels",23.55);
        art3=new Article(5,"Lunettes fff",27.55);
        art4=new Article(7,"Xylophone volant",29.55);
        comm=new Commande(art,2);
        comm2=new Commande(art,2);
        comm3=new Commande(art3,5);
        comm4=new Commande(art4,7);
    }
    
    @Test
    public void testCommandeEquals_si_identique()
    {
        assertEquals(comm,comm2);
    }
    @Test
    public void testCommandeEquals_si_not_identique()
    {
        assertNotEquals(comm3,comm4);
    }
    @Test
    public void testCommandeCompareTo_si_not_identiqueEtPlusPetit()
    {
        
        assertTrue(comm.compareTo(comm4)<0);
    }
    @Test
    public void testCommandeCompareTo_si_not_identiqueEtPlusGrand()
    {
        
        assertTrue(comm4.compareTo(comm)>0);
    }
    @Test
    public void testCommandeCompareTo_si_identique()
    {
        assertTrue(comm.compareTo(comm2)==0);
    }
}
