/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.test;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;
import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import ch.hesge.projetecole.metier.ArticleToken;
import ch.hesge.projetecole.metier.ListeArticles;
import java.util.*;
/**
 *
 * @author patrickribeiroamaral
 */
public class TestArticleToken {
    private ListeArticles listeArt;
    private List<Commande> listeCom;
    private List<Article> listeArticle;
    private Article art;
    private Article art2;
    private Article art3;
    private Article art4;
    private Commande comm;
    private Commande comm2;
    private Commande comm3;
    private Commande comm4;
    private ArticleToken articleToken;
    
  @BeforeMethod
  public void setUp() throws Exception {
     listeArt= new ListeArticles();
     listeCom=new ArrayList<>();
     listeArticle=new ArrayList<>();
     art=new Article(2,"Lunettes virtuels",23.55);
        art2=new Article(3,"Lunettes virtuels",23.55);
        art3=new Article(5,"Lunettes fff",27.55);
        art4=new Article(7,"Xylophone volant",29.55);
        comm=new Commande(art,2);
        comm2=new Commande(art2,2);
        comm3=new Commande(art3,5);
        comm4=new Commande(art4,7);
        listeArt.add(art);
        listeArt.add(art2);
        listeArt.add(art3);
        listeArt.add(art4);
        listeCom.add(comm);
        listeCom.add(comm2);
        listeCom.add(comm3);
        listeCom.add(comm4);
         articleToken=new ArticleToken();
  }
  
  @Test
  public void testQtePrTouteCommandeEstEgaleAmethode()
  {
      int maSomme=2+2+5+7;
      int nb=ArticleToken.calculeResultatsRetournNb(listeCom);
      assertEquals(maSomme,nb);
  }
  
  @Test
  public void testPrixPrTouteCommandeEstEgaleAmethode()
  {
      double maSomme=(23.55*2)+(23.55*2)+(27.55*5)+(29.55*7);
      double nb=ArticleToken.calculeResultatsRtournePrix(listeCom);
      assertEquals(maSomme,nb);
  }
  
  @DataProvider(name = "article")
  public Object[][] article() {
    Object[][] article = new Object[3][3];
    article[0] = new Object[]{3, "Lunettes virtuels", 32.1};
    article[1] = new Object[]{3, "Casque Virtuel",  27.4};
    article[2] = new Object[]{3, "Xylophone",  29.4};
    return article;
  }

  @Test(dataProvider = "article")
  public void test_creation_article(int id,String nom, double prix) {
    String ligne = id+";"+nom + ";" + prix;
    Article artRecup=articleToken.creerArticle(ligne);

    Article artNew = new Article(id, nom, prix);

    assertEquals(artNew, artRecup);
  }
  
}
