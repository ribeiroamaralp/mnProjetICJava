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
  public void isLigneEquipeTrueTest(String ligne){
    fichier = new FichierTexte(ligne);
    if (!fichier.ismaLigneArticle()) {
      fail("votre méthode est vrai");
    }
  }
  
  @Test
  public void test_si_size_estNull()
  {
      assertFalse(fichier.isNull());
  }
  
  @Test
  public void test_si_Size_estOK()
  {
      assertTrue(fichier.size()>0);
  }
}

