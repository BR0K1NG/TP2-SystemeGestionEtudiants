/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

import java.util.ArrayList;

/**
 *
 * @author eniso2023
 */
public class SystemeGestionEtudiants {
    private ArrayList<Etudiant> listEtudiants;
    public SystemeGestionEtudiants(ArrayList<Etudiant> list ) {
          this.listEtudiants  = list;
          
          
     }
    public void ajouterEtudiant(String nom, String prenom, String numIns, String email) {
        Etudiant e = new Etudiant(nom, prenom, numIns,email);
        listEtudiants.add(e);
    }
    public void afficherEtudiants() {
        listEtudiants.forEach((e) -> System.out.println(e.toString())  );
    }
    public void modiferEmailEtudiant(String numIns, String nouvEmail) {
        for (Etudiant e : listEtudiants) {
            if (e.getNumIns().equals(numIns)) {
                e.setEmail(nouvEmail);
            }
        }
        
    }
    public void supprimerEtudiant(String numIns){
        for (Etudiant e : listEtudiants) {
            if (e.getNumIns().equals(numIns)) {
                listEtudiants.remove(e);
            }
        }
    }
    
}
