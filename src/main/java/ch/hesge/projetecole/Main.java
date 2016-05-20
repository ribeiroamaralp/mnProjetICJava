/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole;


/**
 *
 * @author patrickribeiroamaral
 */
public class Main {
    private static void main(String[] args) {
        
        String fileName = args[0];
        System.err.println("Traitement des articles dans \"" + fileName + "\" :");
        Mesarticles mesArticles = new Mesarticles();
        mesArticles.traiterFichier(fileName);
    } 
    
}
      
