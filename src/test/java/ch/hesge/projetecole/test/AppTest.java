package ch.hesge.projetecole.test;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;
import java.awt.List;
/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private ArrayList maListe= new ArrayList();
    
 
    
    @Test
    public  void addArticle()
    {
        Article at = new Article(2,"Lunettes virtuels",23.55);
        maListe.add(at);
        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.toString());
        }
    }
    
   
}
