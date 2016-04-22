package ch.hesge.projetecole.test;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
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
    private ArrayList<Article> maListe= new ArrayList();
    private ArrayList<Article> maListeTotal=new ArrayList();
    private ArrayList<Commande> maListeCommande=new ArrayList();
    private ArrayList<Commande> maListeCommandeToutes=new ArrayList();
    private int nbr;
    private int nbrP=0;
    private double sommeDeux;
    
    @Test
    public  void addArticleTest()
    {
        int tailleDebut = maListe.size();
        Article at = new Article(2,"Lunettes virtuels",23.55);
        maListe.add(at);
        int tailleFinal = maListe.size();

        assertTrue(tailleFinal == tailleDebut + 1);
    }
    
   

   @Test
   public void TestNbrArticleParCommandeEtSonMontantTotal()
   {
       Article arti = new Article(25,"Lunettes de soleil",67.00);
        Article att=new Article(3,"Casque Virtuel",45.55);
        Article art=new Article(5,"Camera de recul",56.00);
        Article at = new Article(2,"Lunettes virtuels",23.55);
        maListe.add(att);
        maListe.add(art);
        maListe.add(arti);
        maListe.add(at);
        Commande com = new Commande(at,1);
        Commande comm = new Commande(att,1);
        Commande comma = new Commande(art,1);
        Commande commande = new Commande(arti,1);
        maListeCommande.add(com);
        maListeCommande.add(comm);
        maListeCommande.add(comma);
        maListeCommande.add(commande);
        for (int i = 0; i < maListeCommande.size(); i++) {
           nbr+=((Commande)maListeCommande.get(i)).getQte();
        }
       for (int i = 0; i < maListeCommande.size(); i++) {
           nbrP=(maListeCommande.get(i)).getQte();
           sommeDeux+=maListeCommande.get(i).getArticle().getPrix()*nbrP;
       }
       System.out.println(nbr+" Articles ");
       System.out.println(sommeDeux+" CHF pour totalité de la commande");
   }
}
