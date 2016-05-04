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
    private static Mesarticles mesArticles;
    
    public static void main(String[] args) {
        System.getProperty("Articles.txt");
        String fileName = "Articles.txt";
        System.out.println("Traitement des articles dans \"" + fileName + "\" :");
        mesArticles = new Mesarticles();
        mesArticles.traiterFichier(fileName);
    } 
}
