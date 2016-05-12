/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import ch.hesge.projetecole.outils.FileStr;
import org.apache.commons.io.FileUtils;
import ch.hesge.projetecole.metier.FichierTexte;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author patrickribeiroamaral
 */
public class TestFileToString {
    private String mnFichier;
    private String maListe;
    private String[] maListeAdd=null;
    String url;
    private String mnChampsTexte="Articles.txt";
    
    @BeforeMethod
    public void setUp() {
       
       //Files.readAllLines(Paths.get(this.getClass().getResource("Articles.txt").toURI()), Charset.defaultCharset());
        url = this.getClass().getResource("/Articles.txt").getPath();
    }
    
    @Test
    public void testRead_siMaListe_est_Remplie()
    {
      maListe=FileStr.read(url);
      assertTrue(maListe.length()>0) ; 
    }
    @Test
    public void testRead_siMaListe_est_Vide()
    {
      maListe=null;
      assertTrue(maListe==null) ; 
    }
    
   @Test 
   public void testWrite_In_Fichier()
   {
       String[] maChaine={"Antione;34"};
   FileStr.write(url, maChaine);
   assertTrue(FileStr.read(url).length()>0);
   }
    
}
