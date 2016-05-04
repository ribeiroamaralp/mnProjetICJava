package ch.hesge.projetecole.test;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import ch.hesge.projetecole.outils.FileStr;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import java.util.*;
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
    private List<Article> maListe= new ArrayList<Article>();
    private List<Article> maListeTotal=new ArrayList<Article>();
    private List<Commande> maListeCommande=new ArrayList<>();
    private List<Commande> maListeCommandeToutes=new ArrayList<>();
    private int nbr;
    private int nbrP=0;
    private double sommeDeux;
    private String mnFichier;
    private String mnChampsTexte="Articles.txt";
    private String[] maListeDonne;
    private Article art;
    private Article art2;
    private Article art3;
    private Article art4;
    private Commande comm;
    private Commande comm2;
    private Commande comm3;
    private Commande comm4;
    
    @BeforeMethod
    public void setUp() {
        mnFichier=System.getProperty(mnChampsTexte);
        
        art=new Article(2,"Lunettes virtuels",23.55);
        art2=new Article(2,"Lunettes virtuels",23.55);
        art3=new Article(5,"Lunettes fff",27.55);
        art4=new Article(7,"Xylophone volant",29.55);
        comm=new Commande(art,2);
        comm2=new Commande(art,2);
        comm3=new Commande(art3,5);
        comm4=new Commande(art4,7);
    }
    
  
    
   

}
