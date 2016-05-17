/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole;

import java.io.FileNotFoundException;

/**
 *
 * @author patrickribeiroamaral
 */
public class Main {
    public static void main(String[] args) {
        
        String fileName = args[0];
        System.out.println("Traitement des articles dans \"" + fileName + "\" :");
        Mesarticles mesArticles = new Mesarticles();
        mesArticles.traiterFichier(fileName);
    } 
    
}
      
