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
    private static Mesarticles mesArticles;
    
    public static void main(String[] args) {
        try{
        System.getProperty("Articles.txt");
        String fileName = "Articles.txt";
        System.out.println("Traitement des articles dans \"" + fileName + "\" :");
        mesArticles = new Mesarticles();
        mesArticles.traiterFichier(fileName);
    } 
        catch (Error e0){e0.getSuppressed();
            
        }}
}
