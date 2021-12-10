/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_michelland_peron;

/**
 *
 * @author guilh
 */
public class Grille {
    Boules []Combinaison= new Boules[4]; 
    Boules []CombinaisonGagnante= new Boules[4]; 
    Boules  [][]grille = new Boules [12][4];
    
public boolean affecterCombinaison (Boules []Combinaison, int nombreessais){

    for (int i=0;i<4;i++){
        grille[nombreessais][i]=Combinaison[i];
        }
    return true;

    }

public boolean Succes(Boules []Combinaison,Boules []CombinaisonGagnante){
    int Compteur=0;
    for (int i=0;i<4;i++){
        if (Combinaison[i]==CombinaisonGagnante[i]){
            Compteur+=1;
        }
    }
    if (Compteur==4){
        return true;
    }
    else{
        return false; 
    }
}

public int [] indice(Boules []Combinaison,Boules []CombinaisonGagnante){
    int bienplacé=0;
    int malplacé=0;
    int [] indice = new int[2];
    
    for (int i=0;i<4;i++){
        if (Combinaison[i]==CombinaisonGagnante[i]){
           bienplacé+=1;
        }
        else{
            bienplacé+=1;
        }
       
    }
    malplacé=4-bienplacé;
    indice[0]=bienplacé;
    indice[1]=malplacé;        
    return indice;

}


}
    
    
    
    

