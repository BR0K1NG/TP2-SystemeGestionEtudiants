/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author eniso2023
 */
public class Livre {
    private String Titre;
    private String Auteur;
    public int annePub;
    public String ISBN;
  
    
    

   public String getTitre() {
       return this.Titre;
}
   public String getAuteur() {
       return this.Auteur;
}
   public void setAuteur(String newAuteur) {
       this.Auteur = newAuteur;
   }
   public void setTitre(String newTitre) {
       this.Titre = newTitre;
   }
   public Livre () {
        
        this.Titre = "Book's Name";
        this.Auteur = "Unkown" ;
          }
   public Livre (String titre, String auteur) {
        
        this.Titre = titre;
        this.Auteur = auteur ;
         }
   public Livre (String titre, String auteur, int annepub) {
        
        this.Titre = titre;
        this.Auteur = auteur ;
        this.annePub = annepub;
         }
   public Livre (String titre, String auteur, int annepub,String ISBN) {
        
        this.Titre = titre;
        this.Auteur = auteur ;
        this.annePub = annepub;
        this.ISBN = ISBN;  }
   public String toString() {
  return "TITRE: "+this.Titre + " AUTEUR:"+this.Auteur+" ANNE DE PUBLICATION : "+this.annePub+"  ISBN : "+this.ISBN;  
  }  
}
