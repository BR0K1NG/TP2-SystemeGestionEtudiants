/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eniso.tp2.systemegestionetudiants;

import java.util.ArrayList;

/**
 *
 * @author eniso2023
 */
public class TP2SystemeGestionEtudiants {

    public static void main(String[] args) {
       Etudiant e1 = new Etudiant("Lejmi", "Wael", "123456", "wael@gmail.com");
       Etudiant e2 = new Etudiant("BEN AMOR", "Aziz", "1908", "aziz@gmail.com");
       Etudiant e3 = new Etudiant("BEN KHALIL", "Taha", "2002", "taher151561@gmail.com");
       ArrayList<Etudiant> listEtudiant = new ArrayList<>();
       listEtudiant.add(e1);
       listEtudiant.add(e2);
       listEtudiant.add(e3);
       SystemeGestionEtudiants s = new SystemeGestionEtudiants(listEtudiant);
       s.afficherEtudiants();
       s.modiferEmailEtudiant("2002", "taher@gmail.fr");
       s.supprimerEtudiant("1908");
       s.afficherEtudiants();
       
       Livre l1 = new Livre ();
       Livre l2 = new Livre ("Namthja","Hamza ");
       Livre l3 = new Livre ("Barbellions","Wael The 3rd",911 );
       Livre l4 = new Livre ("keyboard warrios","internet protagonist",2023,"978-3-16-148410-0");
       

       System.out.println(l1.toString());
       System.out.println(l2.toString());
       System.out.println(l3.toString());
       System.out.println(l4.toString());
    }
    
    
    
}
