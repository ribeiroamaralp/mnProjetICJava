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
    private static  String url="";
    public static void main(String[] args) {
        try{
        
        String fileName = "Articles.txt";
        System.out.println("Traitement des articles dans \"" + fileName + "\" :");
        mesArticles = new Mesarticles();
        mesArticles.traiterFichier();
    } 
        catch (Error e0){e0.getSuppressed();
            
        }}
}
