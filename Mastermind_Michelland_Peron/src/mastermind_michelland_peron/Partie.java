/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_michelland_peron;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guilh
 */
public class Partie {
    Grille grillejeu;
    Boules []Listeboules=new Boules[4];
    String []listecouleurs=new String[7];
    Random r= new Random();
    String nom;
    
  
public String joueur() {
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Nom du joueur 1 :");
    String nom = new String(sc.nextLine());
    return nom;
   
}  
    

public void     Joueur(String lenom) {
    nom = lenom;
}
    
   
public String []listecouleurs (){
    listecouleurs[0]="\033[31m O";
    listecouleurs[1]="\033[31m O";
    listecouleurs[2]="\033[31m O";
    listecouleurs[3]="\033[31m O";
    listecouleurs[4]="\033[31m O";
    listecouleurs[5]="\033[31m O";
    listecouleurs[6]="\033[31m O";
    return listecouleurs;

}   
    
 
public void listeboules(Boules B){
    for(int i=0;i<4;i++){
        int rand=r.nextInt(7);
        Listeboules[i]=B;
        Listeboules[i].couleur=listecouleurs[rand];
    }
    
    }
}



