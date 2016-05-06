/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.projetecole.metier;

import ch.hesge.projetecole.domaine.Article;
import ch.hesge.projetecole.domaine.Commande;
import java.util.StringTokenizer;
import java.util.*;

/**
 *
 * @author patrickribeiroamaral
 */
public class ArticleToken {

    public Article creerArticle(String ligne) {
        StringTokenizer strElem = new StringTokenizer(ligne, ";");
        int idArt = Integer.parseInt(strElem.nextToken());
        String nomArt = strElem.nextToken();
        double prixArt = Double.parseDouble(strElem.nextToken());

        return new Article(idArt, nomArt, prixArt);
    }

    public  void AjoutCommande(java.awt.List maListAInt, java.awt.List maListCInt, List maListeCom, List maListeArt) {
        int[] sel = maListAInt.getSelectedIndexes();

        for (int k = 0; k < sel.length; k++) {
            Article art = (Article) maListeArt.get(sel[k]);
            Commande com = new Commande(art, 1);
            int indCom = maListeCom.indexOf(com);
            if (indCom == -1) {
                insert(com, maListeCom, maListCInt);
            } else {
                com = (Commande) maListeCom.get(indCom);
                com.incQte(1);
                maListCInt.replaceItem(com.toString(), indCom);
            }
            maListAInt.deselect(sel[k]);
            
        }
        
    }
      

    public  void insert(Comparable comp, List mod, java.awt.List lst) {
        int pos = 0;
        while ((pos < mod.size()) && (((Comparable) mod.get(pos)).compareTo(comp) <= 0)) {
            pos++;
        }
        mod.add(pos, comp);
        lst.add(comp.toString(), pos);
    }

    public  void supprimerSelect(java.awt.List maListCInt,List maListC) {
        int sel[] = maListCInt.getSelectedIndexes();
        for (int i = 0; i < sel.length; i++) {
            maListCInt.remove(sel[i]);
            maListC.remove(sel[i]);
        }
        
    }

    public  int calculeResultatsRetournNb(List listeComm) {
        double s = 0;
        int nb = 0;
        for (int k = 0; k < listeComm.size(); k++) {
            Commande com = (Commande) listeComm.get(k);
            s += com.getArticle().getPrix() * com.getQte();
            nb += com.getQte();
        }
    //tfTotalCommande.setText(format.format(s));
        //tfNbArticles.setText(Integer.toString(nb));
        return nb ;

    }
    public  double calculeResultatsRtournePrix(List listeComm) {
        double s = 0;
        int nb = 0;
        for (int k = 0; k < listeComm.size(); k++) {
            Commande com = (Commande) listeComm.get(k);
            s += com.getArticle().getPrix() * com.getQte();
            nb += com.getQte();
        }
    //tfTotalCommande.setText(format.format(s));
        //tfNbArticles.setText(Integer.toString(nb));
        return s ;

    }

    public  void majArticle(List listeGen,java.awt.List maList) {
        maList.removeAll();
        for (int i = 0; i < listeGen.size(); i++) {
            maList.add(listeGen.get(i).toString());
        }
    }
}
