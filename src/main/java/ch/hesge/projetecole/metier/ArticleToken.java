/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.metier;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import java.util.StringTokenizer;
import java.util.*;

/**
 *
 * @author patrickribeiroamaral
 */
public class ArticleToken {
    private FichierTexte fichier;
    private List<Article> lstArts = new ArrayList();

    public Article creerArticle(String ligne) {
        StringTokenizer strElem = new StringTokenizer(ligne, ";");
        int idArt = Integer.parseInt(strElem.nextToken());
        String nomArt = strElem.nextToken();
        double prixArt = Double.parseDouble(strElem.nextToken());

        return new Article(idArt, nomArt, prixArt);
    }

    public List getListeArticle() {

    while (!fichier.existeDsListe()) {
      String ligne = fichier.getLigneCourante();
      Article art= creerArticle(ligne);
      
      lstArts.add(art);
      fichier.nextLigne();
    }

    return lstArts;
  }
      

    

    

    public  int calculeResultatsRetournNb(List listeComm) {
        double s = 0;
        int nb = 0;
        for (int k = 0; k < listeComm.size(); k++) {
            Commande com = (Commande) listeComm.get(k);
            s += com.getArticle().getPrix() * com.getQte();
            nb += com.getQte();
        }
    //tfTotalCommande.setText(format.format(s));
        //tfNbArticles.setText(Integer.toString(nb));
        return nb ;

    }
    public  double calculeResultatsRtournePrix(List listeComm) {
        double s = 0;
        int nb = 0;
        for (int k = 0; k < listeComm.size(); k++) {
            Commande com = (Commande) listeComm.get(k);
            s += com.getArticle().getPrix() * com.getQte();
            nb += com.getQte();
        }
    //tfTotalCommande.setText(format.format(s));
        //tfNbArticles.setText(Integer.toString(nb));
        return s ;

    }

    
}
