/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import ch.hesge.projetecole.outils.FileStr;
/**
 *
 * @author patrickribeiroamaral
 */
public class TestFileToString {
    private String mnFichier;
    private String[] maListe=null;
    private String[] maListeAdd=null;
    
    private String mnChampsTexte="Articles.txt";
    
    @BeforeMethod
    public void setUp() {
        mnFichier=System.getProperty(mnChampsTexte);
        
        
    }
    
    @Test
    public void testRead_siMaListe_est_Remplie()
    {
      maListe=FileStr.read(mnChampsTexte);
      assertTrue(maListe.length>0) ; 
    }
    @Test
    public void testRead_siMaListe_est_Vide()
    {
      maListe=null;
      assertTrue(maListe==null) ; 
    }
    
   
    
}
