/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole;
import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.metier.FichierTexte;
import ch.hesge.projetecole.metier.ListeArticles;
import ch.hesge.projetecole.metier.ArticleToken;
import ch.hesge.projetecole.outils.FileStr;
/**
 *
 * @author patrickribeiroamaral
 */
public class Mesarticles {

  private final ListeArticles listeArticles;
  private final ArticleToken articlesTk;


  public Mesarticles() {
    listeArticles = new ListeArticles();
    articlesTk = new ArticleToken();
  }

  public void traiterFichier(String fileName) {
    String url=this.getClass().getResource("/"+fileName).getPath();
    String data = FileStr.read(url);
    String ligne="";
    FichierTexte fichier = new FichierTexte(data);
    
    while (!fichier.existeDsListe()) {
       ligne = fichier.getLigneCourante();
        creerArticle(ligne);
        System.out.println(ligne);
        fichier.nextLigne();
      }
    }
  

  public void creerArticle(String strLigne) {
    Article art= articlesTk.creerArticle(strLigne);
    listeArticles.add(art);
  }

  
}

