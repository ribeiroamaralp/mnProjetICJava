/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.metier;
import ch.hesge.projetecole.domaine.Article;
import java.util.*;

/**
 *
 * @author patrickribeiroamaral
 */
public class ListeArticles {
    
    private final List<Article> listeArt;

    public ListeArticles(ArticleToken artiTk) {
    listeArt = artiTk.getListeArticle();
  }
    
  public ListeArticles() {
    listeArt = new ArrayList<> ();
  }

  public final int size() {
    return listeArt.size();
  }


  public void add(Article at) {
    listeArt.add(at);
  }

  public Article getArticleLast() {
    int dernierArticle = listeArt.size() - 1;
    Article art = listeArt.get(dernierArticle);

    return art;
  }

  public void afficherArticles() {
      for (int i = 0; i < listeArt.size(); i++) {
          System.err.println(listeArt.get(i).toString());
      }
  }
}
