/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author eniso2023
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private String numIns;
    private String email;
    
    
    public Etudiant (String nom, String prenom, String numins,String email) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.numIns = numins;
        this.email = email;  }
    

   public String getPrenom() {
       return this.prenom;
}
   public String getNumIns() {
       return this.numIns;
}
   public String getNom() {
       return this.nom;
}
   public String getEmail() {
       return this.email;
}
   public void setNom(String newNom) {
       this.nom = newNom;
   }
   public void setPreNom(String newPrenom) {
       this.prenom = newPrenom;
   }
   public void setNumIns(String newNumIns) {
       this.numIns = newNumIns;
   }
   public void setEmail(String newEmail) {
       this.email = newEmail;
   }
   public String toString() {
  return "LNAME: "+this.nom + " FNAME "+this.prenom+" NUMINS: "+this.numIns+" EMAIL @: "+this.email;  
  }  
   
}