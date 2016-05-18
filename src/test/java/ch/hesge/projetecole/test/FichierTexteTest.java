/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package ch.hesge.projetecole.test;

import ch.hesge.projetecole.metier.FichierTexte;
import static org.testng.Assert.fail;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.mockito.mock.*;

/**
 * @author Patrick Ribeiro
 */

public class FichierTexteTest {
  private FichierTexte fichier;
  
  @DataProvider(name = "dataTrue")
  public Object[][] dataTrue() {
    Object[][] dataTrue = new Object[3][1];
    dataTrue[0] = new Object[]{"5;Alpha SV Jkt M Cayenne;650"};
    dataTrue[1] = new Object[]{"26;La Sorcha Jacket Rip Curl;139.9"};
    dataTrue[2] = new Object[]{"11;Le Q-96 Lumen de Salomon;479"};
    return dataTrue;
  }
  
  @DataProvider(name = "dataFalse")
  public Object[][] dataFalse() {
    Object[][] dataFalse = new Object[3][1];
    dataFalse[0] = new Object[]{"26;La Sorcha Jacket Rip Curl"};
    dataFalse[1] = new Object[]{"Alpha SV Jkt M Cayenne;650"};
    dataFalse[2] = new Object[]{"11;Le Q-96 Lumen de Salomon"};
    return dataFalse;
  }
  
  @Test(dataProvider = "dataFalse")
  public void isLigneArticleFalseTest(String ligne){
    fichier = new FichierTexte(ligne);
    if (fichier.ismaLigneArticle()) {
      fail("votre méthode est erronée ");
    }
  }
  
  @Test(dataProvider = "dataTrue")
  public void isLigneArticleTrueTest(String ligne){
    fichier = new FichierTexte(ligne);
    if (!fichier.ismaLigneArticle()) {
      fail("votre méthode est vrai");
    }
  }
  
  @Test
  public void test_si_size_estNull()
  {
      assertFalse(fichier.existeDsListe());
  }
  
  @Test
  public void test_si_Size_estOK()
  {
      assertTrue(fichier.size()>0);
  }
  
  
  @Test
  public void test_si_Liste_PLusggrand()
  {
      FichierTexte fichier;
     
  }
   @Test
  public void ligneCourantTest() {
    String ligne1 = "7;Iphone 6;159.7";
    String ligne2 = "9;Samsung Galaxy;300.2";
    FichierTexte fichier = new FichierTexte(ligne1 + "\n\r" + ligne2);

    assertEquals(fichier.getLigneCourante(), ligne1);

    fichier.nextLigne();
    
    assertEquals(fichier.getLigneCourante(), ligne2);
  }
}

