/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.metier;

import java.util.StringTokenizer;
/**
 *
 * @author patrickribeiroamaral
 */
public class FichierTexte {
    

  private String[] listeLigne;
  private int ligneCourante;
  private int listeSize;

  public FichierTexte(String data) {

    StringTokenizer strLigne = new StringTokenizer(data, "\n\r");
    listeSize = strLigne.countTokens();
    
    listeLigne = new String[listeSize];
    int i = 0;
    while (strLigne.hasMoreTokens()) {
      String uneLigne = strLigne.nextToken();
      listeLigne[i] = uneLigne;
      i++;
    }
    ligneCourante = 0;
  }
  public int size() {
    return listeLigne.length;
  }
  
  public String getLigneCourante() {
    return listeLigne[ligneCourante];
  }

  public boolean existeDsListe() {
    return ligneCourante >= listeSize;
  }
  
  public boolean ismaLigneArticle() {
    String ligne = listeLigne[ligneCourante];
    StringTokenizer strLigne = new StringTokenizer(ligne, ";");
    return strLigne.countTokens() == 3;
  }

  public int nextLigne() {
     return ligneCourante++;
  }
}
