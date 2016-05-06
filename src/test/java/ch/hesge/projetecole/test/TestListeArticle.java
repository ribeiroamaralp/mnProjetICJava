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
import ch.hesge.projetecole.metier.ListeArticles;
import ch.hesge.projetecole.domaine.Article;

/**
 *
 * @author patrickribeiroamaral
 */
public class TestListeArticle {

    private ListeArticles listeArt;

    @BeforeMethod
    public void setUp() throws Exception {
        listeArt = new ListeArticles();
    }

    @Test
    public void getDerniereArticleTest() {
        Article art1 = new Article(9, "DCLA 14 Jkt Black", 229.1);
        Article art2 = new Article(2, "Veste de ski Femme HAGLOFS", 349);
        Article art3 = new Article(22, "Pack Jackpot 2014", 540);

        listeArt.add(art1);
        listeArt.add(art2);
        listeArt.add(art3);

        Article artSlect = listeArt.getArticleLast();

        assertEquals(artSlect, art3);
    }

    @Test
    public void test_taille_PriseENCompteAPresAjout() {
        Article art1 = new Article(9, "DCLA 14 Jkt Black", 229.1);
        Article art2 = new Article(2, "Veste de ski Femme HAGLOFS", 349);
        Article art3 = new Article(22, "Pack Jackpot 2014", 540);

        listeArt.add(art1);
        listeArt.add(art2);
        listeArt.add(art3);

        assertEquals(listeArt.size(), 3);
    }

    @Test(enabled=false)
    public void AffichageArticleTest() {
        Article art1 = new Article(9, "DCLA 14 Jkt Black", 229.1);
        Article art2 = new Article(2, "Veste de ski Femme HAGLOFS", 349);
        Article art3 = new Article(22, "Pack Jackpot 2014", 540);

        listeArt.add(art1);
        listeArt.add(art2);
        listeArt.add(art3);

        listeArt.afficherArticles();
        

    }
}
