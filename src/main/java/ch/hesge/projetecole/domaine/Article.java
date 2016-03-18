package ch.hesge.projetecole.domaine;

/**
 * Objet métier représentant un Article
 * 
 * Pas possibilité de création d'un Article vide
 * 
 * Les données sont en lecture seule (une fois un Article instancié, il ne peut pas être modifié)
 * 
 * @author JSI
 * @version 1.1
 */
public class Article implements Comparable {
    
  public static final String MONNAIE = "CHF";

  private int id;              /* Identifiant */
  private String designation;  /* Désignation de l'article */
  private double prix;         /* Prix unitaire de l'article */

  public Article (int id, String designation, double prix) {
    this.id = id;
    this.designation = designation;
    this.prix = prix;
  } // Constructeur

  /* Accesseurs */
  public int getId () {return id;}
  public String getDesignation () {return designation;}
  public double getPrix () {return prix;}
  
  /**
   * Compare alphabétiquement par rapport aux designation
   * 
   * @param obj : object à comparer de même classe Article
   * @return : -1 plus petit, 0 égal, +1 plus grand
   */
  public int compareTo (Object obj) {
    return designation.toUpperCase().compareTo(((Article)obj).designation.toUpperCase()); 
  } // compareTo

  /**
   * Test l'égalité sur la base du n° d'article
   * 
   * @param obj : object à tester de même classe Article
   * @return : true : égalité, false autrement
   */    
  public boolean equals (Object obj) {
    return (id == ((Article)obj).id);
  } // equals  

  /**
   * Texte qui sera utilisé pour l'affichage dans la liste de la vue
   * Affichage de la description et du prix du cadeau
   * 
   * @return : la chaîne de caractères de la description de l'objet
   */    
  public String toString () {
    return designation + " : (" + prix + " " + MONNAIE + ")";
  } // toString    

} // Article
