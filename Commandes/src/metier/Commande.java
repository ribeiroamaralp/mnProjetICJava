package metier;

/**
 * Objet métier représentant une Commande
 * 
 * Pas possibilité de création d'une Commande vide
 * 
 * L'Article qui fait l'objet de la Commande est en lecture seule (une fois une Commande instanciée, l'Article ne peut pas être modifié)
 * La quantité peut être ajustée selon la commande
 * 
 * @author JSI
 * @version 1.1
 */
public class Commande implements Comparable {
    
  private Article article; /* Référence de l'article qui fait l'objet de la commande: identifiant */
  private int qte;         /* Quantité: nombre d'unités commandées */

  public Commande (Article article, int qte) {
    this.article = article;
    this.qte = qte;
  } // Constructeur

  /* Accesseurs */
  public Article getArticle () {return article;}
  public int getQte () {return qte;}
  public void setQte (int qte) {this.qte = qte;}
  public void incQte (int qteSuplementaire) {this.qte += qteSuplementaire;}

  /**
   * Compare par rapport à la désignation de l'article commandé
   * 
   * @param obj : object à comparer de même classe Commande
   * @return : -1 plus petit, 0 égal, +1 plus grand
   */
  public int compareTo (Object obj) {
    return article.compareTo(((Commande)obj).article);
  } // compareTo

  /**
   * Test l'égalité sur la base des références des articles
   * 
   * @param obj : object à tester de même classe Article
   * @return : true : égalité, false autrement
   */
  public boolean equals (Object obj) {
    return article.equals(((Commande)obj).article);
  } // equals

  /**
   * Texte utilisé pour l'affichage dans la liste des commandes
   * 
   * @return : la chaîne de caractères de la description de l'objet
   */      
  public String toString () {
    return qte + " x " + article.toString() + " = " + (article.getPrix() * qte) + " " + Article.MONNAIE;
  } // toString

} // Commande
